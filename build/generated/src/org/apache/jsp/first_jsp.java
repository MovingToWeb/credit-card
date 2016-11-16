package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class first_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n");
      out.write("<!-- This Site Was Designed By Wayne D. Fields http://illusivedesign.cjb.net -->\n");
      out.write("<!-- Please make sure you read all of the read me file that came with this template then\n");
      out.write("you may delete this comment -->\n");
      out.write("<html>\n");
      out.write("<head><META \n");
      out.write("http-equiv=\"refresh\" \n");
      out.write("content=\"3;URL=index.jsp\">\n");
      out.write("\n");
      out.write("\t<title>Welcome !!</title>\n");
      out.write("\t\n");
      out.write("<meta NAME=\"description\" CONTENT=\"Insert Description Here\">\n");
      out.write("<meta NAME=\"keywords\" CONTENT=\"Insert Keywords Here\">\n");
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("a:link, a:active, a:visited {\n");
      out.write("color: #CBAC57; \n");
      out.write("text-decoration: underline}\n");
      out.write("\n");
      out.write("\n");
      out.write("a:hover {\n");
      out.write("color: #B28816; \n");
      out.write("text-decoration: none}\n");
      out.write("\n");
      out.write("BODY {\n");
      out.write("scrollbar-face-color: #000000; \n");
      out.write("scrollbar-shadow-color: #CBAC57; \n");
      out.write("scrollbar-highlight-color: #CBAC57; \n");
      out.write("scrollbar-3dlight-color: #000000;\n");
      out.write("scrollbar-darkshadow-color: #000000; \n");
      out.write("scrollbar-track-color: #000000; \n");
      out.write("scrollbar-arrow-color: #CBAC57;\n");
      out.write("overflow: hidden}\n");
      out.write("//-->\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body bgcolor=\"#000000\" marginwidth=\"0\" marginheight=\"0\" leftmargin=\"0\" topmargin=\"0\">\n");
      out.write("<center>\n");
      out.write("<table height=\"100%\" width=\"100%\">\n");
      out.write("<tr>\n");
      out.write("<td align=\"center\"><br><br>\n");
      out.write("\n");
      out.write("<object width=\"550\" height=\"400\">\n");
      out.write("<param name=\"movie\" value=\"ramaniyam.swf\">\n");
      out.write("<embed src=\"rainbow.swf\" width=\"550\" height=\"400\">\n");
      out.write("</embed>\n");
      out.write("</object>\n");
      out.write("\n");
      out.write("<br><br><!-- Copyright -->\n");
      out.write("<font size=\"1\" color=\"#810541\" face=\"Arial\">\n");
      out.write("<strong>Copyright &copy; 2008. All rights reserved.<br>\n");
      out.write("</strong></font>\n");
      out.write("<!-- Copyright -->\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
