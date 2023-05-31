package controller;

import dao.PerroDaoLocal;
import entity.Perro;
import jakarta.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PerroServlet extends HttpServlet {
    
    @EJB
    private PerroDaoLocal perroDao;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action=request.getParameter("action");
        String idPerroStr= request.getParameter("idPerro");
        int idPerro=0;
        if(idPerroStr!=null && !idPerroStr.equals(""))
          idPerro=Integer.parseInt(idPerroStr);

        String nombrePerro=request.getParameter("nombrePerro");
        String razaPerro=request.getParameter("razaPerro");
        String edadPerro=request.getParameter("edadPerro");
        char sexoPerro= request.getParameter("sexoPerro").charAt(0);
       
        Perro perro=new Perro(idPerro,nombrePerro,razaPerro,edadPerro, sexoPerro);
        
        if("Add".equalsIgnoreCase(action)){
        perroDao.addPerro(perro);
       
        }  else  if("Edit".equalsIgnoreCase(action)){
           perroDao.editPerro(perro);
           
        }else   if("Delete".equalsIgnoreCase(action)){
           perroDao.deletePerro(idPerro);
   
        }else  if("Search".equalsIgnoreCase(action)){
           perro=perroDao.getPerro(idPerro);
        }
       
        request.setAttribute("perro",perro);
        request.setAttribute("allPerros", perroDao.getAllPerros());
        request.getRequestDispatcher("perroinfo.jsp").forward(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PerroServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PerroServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
