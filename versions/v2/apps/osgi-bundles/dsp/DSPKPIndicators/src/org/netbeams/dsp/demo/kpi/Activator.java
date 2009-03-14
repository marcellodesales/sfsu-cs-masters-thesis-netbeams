package org.netbeams.dsp.demo.kpi;


import org.apache.log4j.Logger;
import org.netbeams.dsp.platform.osgi.ActivatorHelper;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
  
	private static final Logger log = Logger.getLogger(Activator.class);

	private BundleContext bundleContext;
	private ServiceRegistration serviceRegistration;
	
	private DSPKPIndicators kpi;
	
  /* (non-Javadoc)
   * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
   */
  public void start(BundleContext bundleContext) throws Exception {
	  log.info("start()");
	  
	  this.bundleContext = bundleContext;
	  kpi = new DSPKPIndicators();
	  serviceRegistration = ActivatorHelper.registerOSGIService(bundleContext, kpi);

	  log.info("start() completed");
  }

  /* (non-Javadoc)
   * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
   */
  public void stop(BundleContext context) throws Exception {
	  log.info("stop()");
	  
	  ActivatorHelper.unregisterOSGIService(bundleContext, serviceRegistration);
	  kpi.stopComponent();
	  
	  log.info("stop() completed");
  }
}