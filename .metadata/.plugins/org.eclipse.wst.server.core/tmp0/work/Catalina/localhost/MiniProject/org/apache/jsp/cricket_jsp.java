/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2023-05-08 04:59:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class cricket_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Sports Clubs</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"cricket.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"hero\">\r\n");
      out.write("        <img src=\"logo.png\" alt=\"\" class=\"logo\">\r\n");
      out.write("        <p class=\"club\">SPORT CLUBS</p>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                <li><a href=\"clubs.jsp\">Clubs</a></li>\r\n");
      out.write("                <li><a href=\"cover.jsp\">Login</a></li>\r\n");
      out.write("                <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"extra\">\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <div class=\"card\" id=\"myBtn\"><img src=\"cricket2.png\">\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h2>CRICKET CLUB</h2>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"myModal\" class=\"modal\">\r\n");
      out.write("                <!-- Modal content -->\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                  <span class=\"close\">&times;</span>\r\n");
      out.write("                  <img src=\"cricket2.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                  <div class=\"content\">\r\n");
      out.write("                    <h1 class=\"club-name\">Cricket Club</h1>\r\n");
      out.write("                  <p class=\"para\">\r\n");
      out.write("                    The Cricket Club provides opportunities for individuals of all ages and skill levels to participate in the sport of cricket. These clubs typically offer training and coaching programs, organize competitive matches and tournaments, and foster a sense of community among their members Our aim is  to promote the sport of cricket and develop players' skills, teamwork, and sportsmanship.</p>\r\n");
      out.write("                    <p class=\"president\">\r\n");
      out.write("                      President: \r\n");
      out.write("                      <p class=\"president_name\">\r\n");
      out.write("                        Shubhendu Parashar \r\n");
      out.write("                      </p>\r\n");
      out.write("                      <p class=\"contact-president\">\r\n");
      out.write("                        Contact:- +91 7544069162\r\n");
      out.write("                      </p>\r\n");
      out.write("                      \r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"Faculty\">\r\n");
      out.write("                      Faculty Incharge: \r\n");
      out.write("                      <p class=\"faculty_name\">\r\n");
      out.write("                        Mr. Tarun Kumar, AP, ME Deptt.\r\n");
      out.write("                      </p>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  \r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("              </div>\r\n");
      out.write("\r\n");
      out.write("<!-- PRONETIX-CARD-------------------- -->\r\n");
      out.write("            <div class=\"card\" id=\"myBtn2\"><img src=\"volleyball.png\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>VOLLEYBALL CLUB</h1>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"myModal2\" class=\"modal2\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close2\">&times;</span>\r\n");
      out.write("                <img src=\"volleyball.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">Volleyball Club</h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  Volleyball is a sports Club that provides opportunities for individuals of all ages and skill levels to participate in the sport of volleyball. The club typically offer training and coaching programs, organize competitive matches and tournaments, and foster a sense of community among their members. Our aim is to promote the sport of volleyball and develop players' skills, teamwork, and sportsmanship.</p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Chirag Deol \r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 9781028408\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Ms. Khushboo, AP, ECE\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("<!-- ISTE CLUB------------------ -->\r\n");
      out.write("            <div class=\"card\" id=\"myBtn3\"><img src=\"football.png\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>FOOTBALL CLUB</h1>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"myModal3\" class=\"modal3\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close3\">&times;</span>\r\n");
      out.write("                <img src=\"foot.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">Football Club</h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  The Indian Society for Technical Education (ISTE) is the leading National Professional non-profit making Society for the Technical Education System in our country with the motto of Career Development of Teachers and Personality Development of Students and overall development of our Technical Education System.</p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Parth Bihani\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 9315507348\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Mr. Kamal Bhatia, AP ECE Deptt\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("            <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("          \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <div class=\"card\" id=\"myBtn4\" ><img src=\"basket.png\">\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>BASKETBALL CLUB</h1>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"myModal4\" class=\"modal4\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close4\">&times;</span>\r\n");
      out.write("                <img src=\"basket.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">Basketball Club</h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  A basketball club is a sports organization that focuses on promoting and developing the game of basketball. Typically, a basketball club is composed of a team or teams of players who compete in local, regional, or national leagues and tournaments.\r\n");
      out.write("Basketball club often have youth programs and academies that provide coaching and training for young players, helping them to develop their skills and prepare for a future in the sport. Some clubs also organize camps and clinics to provide instruction and training for players of all ages\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Arpit Kumar Shukla\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 6390540612\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Mr. Ritesh Kumar Singh, AP CSE.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            <div class=\"card\" id=\"myBtn5\"><img src=\"indoor.png\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>INDOOR GAMES</h1>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"myModal5\" class=\"modal5\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close5\">&times;</span>\r\n");
      out.write("                <img src=\"indoor.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">Indoor Games Club</h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  Niet Coding Club provides participating students an opportunity to learn the basics of computer programming in a team . The club's main focus is on creating applications, websites, games, stem/steam workshops, and other projects.\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Riya Bisht\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 8076475243\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Mr. Ankur Chaudhary, AP IT Deptt. \r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\" id=\"myBtn6\"><img src=\"kabbadi1.png\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>KABBADI CLUB</h1>\r\n");
      out.write("                <p></p>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"myModal6\" class=\"modal6\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close6\">&times;</span>\r\n");
      out.write("                <img src=\"kabbadi1.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">Kabbadi Club </h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  A Kabaddi club is a sports organization that provides opportunities for individuals to participate in the traditional Indian contact sport of Kabaddi. Our club typically offer training and coaching programs, organize competitive matches and tournaments, and foster a sense of community among their members\r\n");
      out.write("\r\n");
      out.write("</p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Ishant Bachchas\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 7830418204\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Mr. Balram Sharma, Sports Incharge \r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("        <div class=\"wrapper\">\r\n");
      out.write("            <div class=\"card\" id=\"myBtn7\" ><img src=\"yoga.png\">\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>YOGA CLUB</h1>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"myModal7\" class=\"modal7\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close7\">&times;</span>\r\n");
      out.write("                <img src=\"yoga.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">Yoga Club </h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  A yoga club is an organization that provides opportunities for individuals to practice and learn about the ancient Indian discipline of yoga. These clubs typically offer yoga classes and workshops, led by certified yoga instructors, as well as meditation sessions and other related activities.\r\n");
      out.write("</p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Shubhendu Parashar\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 7544069162\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Mr. Yaduvir Singh, AP, CS DS \r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\" id=\"myBtn8\"><img src=\"athletics.png\"/>\r\n");
      out.write("              <div class=\"info\">\r\n");
      out.write("                <h1>ATHLETICS CLUB</h1>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"myModal8\" class=\"modal8\">\r\n");
      out.write("              <!-- Modal content -->\r\n");
      out.write("              <div class=\"modal-content\">\r\n");
      out.write("                <span class=\"close8\">&times;</span>\r\n");
      out.write("                <img src=\"CYBER.png\" alt=\"\" class=\"popcard\">\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                  <h1 class=\"club-name\">Athletic Club </h1>\r\n");
      out.write("                <p class=\"para\">\r\n");
      out.write("                  Cyberhack club is related to cyber security and ethical hacking in which we try to make students aware of cyber attacks, like how their data is compromised. Different aspects of attacks how it is done and deeper knowledge of cyber security. And we try to teach how hacking is done, how you could be safe. \r\n");
      out.write("We make students know what actually hacking is, hacking is not how it looks like, what's the reality behind it.</p>\r\n");
      out.write("                  <p class=\"president\">\r\n");
      out.write("                    President: \r\n");
      out.write("                    <p class=\"president_name\">\r\n");
      out.write("                      Suchit Bhardwaj\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <p class=\"contact-president\">\r\n");
      out.write("                      Contact:- +91 8477826910\r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                  <p class=\"Faculty\">\r\n");
      out.write("                    Faculty Incharge: \r\n");
      out.write("                    <p class=\"faculty_name\">\r\n");
      out.write("                      Mr. Sover Singh, AP, CSDS \r\n");
      out.write("                    </p>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                  </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("              </div>\r\n");
      out.write("              <!-- <button value=\"submit\">GALLERY</button> -->\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <script src=\"cricket.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
