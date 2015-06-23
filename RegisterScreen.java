

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import Business.Registration;
import Business.UpdateRegistration;

import com.cloudgarden.resource.SWTResourceManager;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class RegisterScreen extends org.eclipse.swt.widgets.Composite {

	private Label lblRegister;
	private Text txtEmail;
	private Label lblEmail;
	private Button btnClr;
	private Button btnReg;
	private CCombo cUType;
	private Text txtAge;
	private Label lAge;
	private Label lblPass;
	private Text txtPass;
	private Label label2;
	private CCombo cProf;
	private Label lblProf;
	private Text txtQualific;
	private Label lblQualific;
	private Text txtLName;
	private Label lblLName;
	private Text txtFName;
	private CCombo cTitles;
	private Label title;
	private Label lblFName;

	{
		//Register as a resource user - SWTResourceManager will
		//handle the obtaining and disposing of resources
		SWTResourceManager.registerResourceUser(this);
	}

	public RegisterScreen(Composite parent, int style) {
		super(parent, style);
		initGUI();
	}
	
	/**
	* Initializes the GUI.
	*/
	private void initGUI() {
		try {
			this.setSize(900, 600);
			this.setBackground(SWTResourceManager.getColor(192, 192, 192));
			FormLayout thisLayout = new FormLayout();
			this.setLayout(thisLayout);
			this.setBackgroundImage(SWTResourceManager.getImage("bcg3.jpg"));
			{
				lblRegister = new Label(this, SWT.NONE);
				FormData lblRegisterLData = new FormData();
				lblRegisterLData.left =  new FormAttachment(0, 1000, 152);
				lblRegisterLData.top =  new FormAttachment(0, 1000, 31);
				lblRegisterLData.width = 597;
				lblRegisterLData.height = 29;
				lblRegister.setLayoutData(lblRegisterLData);
				lblRegister.setText("Please Enter Your Details For Registration\r\n");
				lblRegister.setAlignment(SWT.CENTER);
				lblRegister.setFont(SWTResourceManager.getFont("Consolas", 18, 1, false, false));
				lblRegister.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
				lblRegister.setForeground(SWTResourceManager.getColor(255, 255, 255));
			}
			{
				btnReg = new Button(this, SWT.PUSH | SWT.CENTER);
				FormData btnRegLData = new FormData();
				btnRegLData.left =  new FormAttachment(0, 1000, 287);
				btnRegLData.top =  new FormAttachment(0, 1000, 538);
				btnRegLData.width = 106;
				btnRegLData.height = 35;
				btnReg.setLayoutData(btnRegLData);
				btnReg.setText("Register");
				btnReg.setFont(SWTResourceManager.getFont("Tw Cen MT Condensed Extra Bold", 12, 0, false, false));
			}
			
			btnReg.addSelectionListener(new SelectionListener() {
				
				public void widgetSelected(SelectionEvent e) {
					// TODO Auto-generated method stub
				//	Registration reg = new Registration(txtFName.getText(),txtLName.getText(),txtEmail.getText(),txtPass.getText(),cUType.getText(),Integer.parseInt(txtAge.getText()));
					String strAge = txtAge.getText();
					System.out.println(strAge);
					
					
					UpdateRegistration ur = new UpdateRegistration(txtFName.getText(),txtLName.getText(),txtEmail.getText(),txtPass.getText(),cUType.getText(),Integer.parseInt(txtAge.getText()));
					if ()
					ur.updateData();
				}
				
				public void widgetDefaultSelected(SelectionEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			
			
			{
				cTitles = new CCombo(this, SWT.NONE);
				FormData cTitlesLData = new FormData();
				cTitlesLData.left =  new FormAttachment(0, 1000, 431);
				cTitlesLData.top =  new FormAttachment(0, 1000, 117);
				cTitlesLData.width = 135;
				cTitlesLData.height = 29;
				cTitles.setLayoutData(cTitlesLData);
				cTitles.setText(" -- Select Your Title --");
				cTitles.setItems(new java.lang.String[] {"  Mr  ","  Mrs  ","  Miss  ","  Dr  ","  Prof  ","  Rev  "});
			}
			{
				FormData txtNameLData = new FormData();
				txtNameLData.left =  new FormAttachment(0, 1000, 245);
				txtNameLData.top =  new FormAttachment(0, 1000, 183);
				txtNameLData.width = 133;
				txtNameLData.height = 29;
				txtFName = new Text(this, SWT.NONE);
				txtFName.setLayoutData(txtNameLData);
			}
			{
				title = new Label(this, SWT.NONE);
				FormData titleLData = new FormData();
				titleLData.left =  new FormAttachment(0, 1000, 297);
				titleLData.top =  new FormAttachment(0, 1000, 117);
				titleLData.width = 115;
				titleLData.height = 29;
				title.setLayoutData(titleLData);
				title.setText("Title");
				title.setAlignment(SWT.CENTER);
				title.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
				title.setForeground(SWTResourceManager.getColor(255, 255, 255));
				title.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 10, 2, false, false));
			}
			{
				lblFName = new Label(this, SWT.NONE);
				FormData lblNameLData = new FormData();
				lblNameLData.left =  new FormAttachment(0, 1000, 118);
				lblNameLData.top =  new FormAttachment(0, 1000, 183);
				lblNameLData.width = 132;
				lblNameLData.height = 29;
				lblFName.setLayoutData(lblNameLData);
				lblFName.setText("First Name");
				lblFName.setAlignment(SWT.CENTER);
				lblFName.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
				lblFName.setForeground(SWTResourceManager.getColor(255, 255, 255));
				lblFName.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 10, 2, false, false));
			}
			{
				lblLName = new Label(this, SWT.NONE);
				lblLName.setText("Last Name");
				FormData label1LData = new FormData();
				label1LData.left =  new FormAttachment(0, 1000, 454);
				label1LData.top =  new FormAttachment(0, 1000, 183);
				label1LData.width = 132;
				label1LData.height = 29;
				lblLName.setLayoutData(label1LData);
				lblLName.setAlignment(SWT.CENTER);
				lblLName.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
				lblLName.setForeground(SWTResourceManager.getColor(255, 255, 255));
				lblLName.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 10, 2, false, false));
			}
			{
				FormData text1LData = new FormData();
				text1LData.left =  new FormAttachment(0, 1000, 586);
				text1LData.top =  new FormAttachment(0, 1000, 183);
				text1LData.width = 128;
				text1LData.height = 29;
				txtLName = new Text(this, SWT.NONE);
				txtLName.setLayoutData(text1LData);
			}
			{
				lblQualific = new Label(this, SWT.NONE);
				lblQualific.setText("Qualifications");
				FormData label1LData1 = new FormData();
				label1LData1.left =  new FormAttachment(0, 1000, 297);
				label1LData1.top =  new FormAttachment(0, 1000, 415);
				label1LData1.width = 132;
				label1LData1.height = 29;
				lblQualific.setLayoutData(label1LData1);
				lblQualific.setAlignment(SWT.CENTER);
				lblQualific.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
				lblQualific.setForeground(SWTResourceManager.getColor(255, 255, 255));
				lblQualific.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 10, 2, false, false));
			}
			{
				FormData text2LData = new FormData();
				text2LData.left =  new FormAttachment(0, 1000, 433);
				text2LData.top =  new FormAttachment(0, 1000, 415);
				text2LData.width = 215;
				text2LData.height = 29;
				txtQualific = new Text(this, SWT.NONE);
				txtQualific.setLayoutData(text2LData);
			}
			{
				lblProf = new Label(this, SWT.NONE);
				lblProf.setText("User Profession");
				FormData label1LData2 = new FormData();
				label1LData2.left =  new FormAttachment(0, 1000, 297);
				label1LData2.top =  new FormAttachment(0, 1000, 357);
				label1LData2.width = 132;
				label1LData2.height = 29;
				lblProf.setLayoutData(label1LData2);
				lblProf.setAlignment(SWT.CENTER);
				lblProf.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
				lblProf.setForeground(SWTResourceManager.getColor(255, 255, 255));
				lblProf.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 10, 2, false, false));
			}
			{
				cProf = new CCombo(this, SWT.NONE);
				cProf.setText(" -- Select Your Professional Status --");
				FormData cCombo1LData = new FormData();
				cCombo1LData.left =  new FormAttachment(0, 1000, 431);
				cCombo1LData.top =  new FormAttachment(0, 1000, 357);
				cCombo1LData.width = 223;
				cCombo1LData.height = 29;
				cProf.setLayoutData(cCombo1LData);
				cProf.setItems(new java.lang.String[] {"  Psychiatrist  ","  Psychologist  ","  Doctor  ","  Nutrition Expert  ","  Ayurveda Doctor  ","  Student  ","  Other Occupation  ","  Unoccupied  "});
			}
			{
				label2 = new Label(this, SWT.NONE);
				label2.setText("User Type");
				FormData label2LData = new FormData();
				label2LData.left =  new FormAttachment(0, 1000, 297);
				label2LData.top =  new FormAttachment(0, 1000, 473);
				label2LData.width = 132;
				label2LData.height = 29;
				label2.setLayoutData(label2LData);
				label2.setAlignment(SWT.CENTER);
				label2.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
				label2.setForeground(SWTResourceManager.getColor(255, 255, 255));
				label2.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 10, 2, false, false));
			}
			{
				lAge = new Label(this, SWT.NONE);
				lAge.setText("Age");
				FormData label1LData3 = new FormData();
				label1LData3.left =  new FormAttachment(0, 1000, 297);
				label1LData3.top =  new FormAttachment(0, 1000, 249);
				label1LData3.width = 132;
				label1LData3.height = 29;
				lAge.setLayoutData(label1LData3);
				lAge.setAlignment(SWT.CENTER);
				lAge.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
				lAge.setForeground(SWTResourceManager.getColor(255, 255, 255));
				lAge.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 10, 2, false, false));
			}
			{
				FormData text2LData1 = new FormData();
				text2LData1.left =  new FormAttachment(0, 1000, 431);
				text2LData1.top =  new FormAttachment(0, 1000, 249);
				text2LData1.width = 133;
				text2LData1.height = 29;
				txtAge = new Text(this, SWT.NONE);
				txtAge.setLayoutData(text2LData1);
			}
			{
				cUType = new CCombo(this, SWT.NONE);
				cUType.setText(" -- Select User Type --");
				FormData cCombo1LData1 = new FormData();
				cCombo1LData1.left =  new FormAttachment(0, 1000, 433);
				cCombo1LData1.top =  new FormAttachment(0, 1000, 473);
				cCombo1LData1.width = 137;
				cCombo1LData1.height = 29;
				cUType.setLayoutData(cCombo1LData1);
				cUType.setItems(new java.lang.String[] {"  Potential patient  ","  Consultant  "});
			}
			{
				btnClr = new Button(this, SWT.PUSH | SWT.CENTER);
				FormData button1LData = new FormData();
				button1LData.left =  new FormAttachment(0, 1000, 480);
				button1LData.top =  new FormAttachment(0, 1000, 538);
				button1LData.width = 106;
				button1LData.height = 35;
				btnClr.setLayoutData(button1LData);
				btnClr.setText("Clear");
				btnClr.setFont(SWTResourceManager.getFont("Tw Cen MT Condensed Extra Bold", 12, 0, false, false));
			}
			{
				lblEmail = new Label(this, SWT.NONE);
				lblEmail.setText("Email");
				FormData label1LData4 = new FormData();
				label1LData4.left =  new FormAttachment(0, 1000, 118);
				label1LData4.top =  new FormAttachment(0, 1000, 302);
				label1LData4.width = 132;
				label1LData4.height = 29;
				lblEmail.setLayoutData(label1LData4);
				lblEmail.setAlignment(SWT.CENTER);
				lblEmail.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
				lblEmail.setForeground(SWTResourceManager.getColor(255, 255, 255));
				lblEmail.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 10, 2, false, false));
			}
			{
				FormData text2LData2 = new FormData();
				text2LData2.left =  new FormAttachment(0, 1000, 252);
				text2LData2.top =  new FormAttachment(0, 1000, 302);
				text2LData2.width = 133;
				text2LData2.height = 29;
				txtEmail = new Text(this, SWT.NONE);
				txtEmail.setLayoutData(text2LData2);
			}
			{
				FormData text1LData1 = new FormData();
				text1LData1.left =  new FormAttachment(0, 1000, 588);
				text1LData1.top =  new FormAttachment(0, 1000, 302);
				text1LData1.width = 133;
				text1LData1.height = 29;
				txtPass = new Text(this, SWT.NONE);
				txtPass.setLayoutData(text1LData1);
			}
			{
				lblPass = new Label(this, SWT.NONE);
				lblPass.setText("Desired Password");
				FormData label1LData5 = new FormData();
				label1LData5.left =  new FormAttachment(0, 1000, 454);
				label1LData5.top =  new FormAttachment(0, 1000, 302);
				label1LData5.width = 132;
				label1LData5.height = 29;
				lblPass.setLayoutData(label1LData5);
				lblPass.setAlignment(SWT.CENTER);
				lblPass.setForeground(SWTResourceManager.getColor(255,255,255));
				lblPass.setFont(SWTResourceManager.getFont("Segoe UI Semibold",10,2,false,false));
				lblPass.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
			}
			this.layout();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	* Auto-generated main method to display this 
	* org.eclipse.swt.widgets.Composite inside a new Shell.
	*/
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell(display);
		RegisterScreen inst = new RegisterScreen(shell, SWT.NULL);
		Point size = inst.getSize();
		shell.setLayout(new FillLayout());
		shell.layout();
		if(size.x == 0 && size.y == 0) {
			inst.pack();
			shell.pack();
		} else {
			Rectangle shellBounds = shell.computeTrim(0, 0, size.x, size.y);
			shell.setSize(shellBounds.width, shellBounds.height);
		}
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}

}
