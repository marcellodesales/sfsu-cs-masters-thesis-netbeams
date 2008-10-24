/*
 * Created on Wed Jun 25 19:19:36 PDT 2008
 */
package org.netbeams.dsp.platform;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.netbeams.dsp.platform.management.component.osgi.DSPBundleController;
import org.netbeams.dsp.util.Log;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	
	private static final Logger log = Logger.getLogger(Activator.class);
	
	private BundleContext bundleContext;
	
	// Plarform
	private Properties platformConfiguration;
	private Platform platform;
	private DSPBundleController dspBundleController;
	
	private String DSP_HOME;
	

	
	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext bundleContext) throws Exception {
		log.debug("start(");
		
		Log.log("Platform.Activator.start()");

		DSP_HOME = obtainHomePath();
		Log.log("Platform.Activator: DSP_HOME = " + DSP_HOME);
		
		this.bundleContext = bundleContext;
		
		dspBundleController = new DSPBundleController(DSP_HOME, this.bundleContext);

		platform = new Platform(DSP_HOME);
		platform.init();
		// Provide the component manager with the mechanism to control deployment
		// units where DSP component resides
		platform.getComponentManager().setDeploymentController(dspBundleController);
		platform.start();
		

	}
	
	/* (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		platform.stop();
		//TODO: Fix
//		if(platformConfiguration.getProperty("platform.bundle.uninstallOnStop", "false").equals("true")){
//			dspBundleController.uninstallPlatformBundles();
//		}
		dspBundleController.uninstallBundles();
	}

		
	private String obtainHomePath(){
		// For now, get it from environment variables
		return System.getenv("DSP_HOME");

	}
	

}