package MenuTree;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFunctionality {
	static JMenu menuButton;
	static JMenu adminButton;
	static JMenu reportsButton;
	
	// To display menu bar
	public static void displayMenu(JMenuBar mBar){
        menuButton=new JMenu("Menu");
        mBar.add(menuButton);
        displayAdministration();
        displayUserAdmin();
        displayProductAdmin();
        displayOrderAdmin();
        displayReports();
        displayWintechReports();
        displayMicrosoftReports();
        
    }
	
	// To display Administration Menu
	public static void displayAdministration(){
        adminButton=new JMenu("Administration");
        menuButton.add(adminButton);
    }
	
	// To Display User Admin
	public static void displayUserAdmin() {
        JMenu userAdminButton=new JMenu("User Admin");
        JMenuItem createUserItem=new JMenuItem("Create User");
        JMenuItem editUserItem=new JMenuItem("Edit User");
        adminButton.add(userAdminButton);
        userAdminButton.add(createUserItem);
        userAdminButton.add(editUserItem);
    }
	
	// To Display Product Admin
	public static void displayProductAdmin(){
        JMenu productAdminButton=new JMenu("Product Admin");
        JMenu allProductsButton=new JMenu("All Products");
        JMenuItem myProductsItem=new JMenuItem("My Products");
        JMenuItem createProductItem=new JMenuItem("Create Product");
        adminButton.add(productAdminButton);
        productAdminButton.add(allProductsButton);
        allProductsButton.add(myProductsItem);
        productAdminButton.add(createProductItem);
    }
	
	// To Display Order Admin	
	public static void displayOrderAdmin(){
        JMenu orderAdminButton=new JMenu("Order Admin");
        JMenu orderReportsButton=new JMenu("Order Reports");
        JMenu auditReportsButton=new JMenu("Audit Reports");
        JMenuItem updatedOrdersItem=new JMenuItem("Updated Orders");
        JMenuItem createdOrdersItem=new JMenuItem("Created Orders");
        JMenuItem createOrderItem=new JMenuItem("Create order");
        adminButton.add(orderAdminButton);
        orderAdminButton.add(orderReportsButton);
        orderReportsButton.add(auditReportsButton);
        auditReportsButton.add(updatedOrdersItem);
        auditReportsButton.add(createdOrdersItem);
        orderAdminButton.add(createOrderItem);
    }
	
	// To display Reports menu
	public static void displayReports(){
		reportsButton=new JMenu("Reports");
        menuButton.add(reportsButton);
    }

	// To display Win Tech Report
    public static void displayWintechReports(){
        JMenuItem winTechReportItem=new JMenuItem("Win Tech Report");
        reportsButton.add(winTechReportItem);
    }

    //To display Microsoft Report
    public static void displayMicrosoftReports(){
        JMenuItem microsoftReportItem=new JMenuItem("Microsoft Report");
        reportsButton.add(microsoftReportItem);
    }
}
