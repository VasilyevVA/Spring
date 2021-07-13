package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.servlet.products.ProductService;

import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "BasicServlet", urlPatterns = "/product")
public class BasicServlet extends HttpServlet {

    private static final Logger logger = LoggerFactory.getLogger(BasicServlet.class);

    private transient ServletConfig config;

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        logger.info("send Product list to client");
        String response = ProductService.getProducts(10).toString();
        //resp.setContentType("text/html");
        resp.getWriter().printf("<h1>Hello, buddy! List of products that you requested: %s </h1>", response);
        resp.getWriter().close();

    }
}
