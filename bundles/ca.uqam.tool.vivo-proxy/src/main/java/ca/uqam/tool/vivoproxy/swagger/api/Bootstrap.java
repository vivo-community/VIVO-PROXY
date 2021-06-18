package ca.uqam.tool.vivoproxy.swagger.api;

import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.models.*;

import io.swagger.models.auth.*;

import javax.servlet.http.HttpServlet;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

public class Bootstrap extends HttpServlet {
  @Override
  public void init(ServletConfig config) throws ServletException {
    Info info = new Info()
      .title("Swagger Server")
      .description("Proxy API for VIVO Data Manipulation")
      .termsOfService("http://swagger.io/terms/")
      .contact(new Contact()
        .email("vivo@uqam.ca"))
      .license(new License()
        .name("Apache 2.0")
        .url("http://www.apache.org/licenses/LICENSE2.0.html"));

    ServletContext context = config.getServletContext();
    Swagger swagger = new Swagger().info(info);
  
  
    new SwaggerContextService().withServletConfig(config).updateSwagger(swagger);
  }
}
