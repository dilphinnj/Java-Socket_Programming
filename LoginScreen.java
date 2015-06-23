

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Device;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

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
public class LoginScreen extends org.eclipse.swt.widgets.Composite {

	private Button btnReg;
	private Text txtUsrName;
	private Text txtPass;
	private Label lblPW;
	private Label lblUN;
	private Button btnLogin;

	{
		//Register as a resource user - SWTResourceManager will
		//handle the obtaining and disposing of resources
		SWTResourceManager.registerResourceUser(this);
	}

	public LoginScreen(Composite parent, int style) {
		super(parent, style);
		initGUI();
	}
	
	/**
	* Initializes the GUI.
	*/
	private void initGUI() {
		try {
			this.setSize(900, 600);
			this.setBackground(SWTResourceManager.getColor(128, 128, 128));
			FormLayout thisLayout = new FormLayout();
			this.setLayout(thisLayout);
			this.setBackgroundImage(SWTResourceManager.getImage("bckg.jpg"));
			this.setForeground(SWTResourceManager.getColor(128, 0, 0));
			this.setLocation(new org.eclipse.swt.graphics.Point(0, -100));
			{
				lblUN = new Label(this, SWT.NONE);
				FormData lblUNLData = new FormData();
				lblUNLData.left =  new FormAttachment(0, 1000, 109);
				lblUNLData.top =  new FormAttachment(0, 1000, 248);
				lblUNLData.width = 120;
				lblUNLData.height = 32;
				lblUN.setLayoutData(lblUNLData);
				lblUN.setText("User Name :");
				lblUN.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
				lblUN.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 15, 0, false, false));
				lblUN.setForeground(SWTResourceManager.getColor(255, 255, 255));
			}
			{
				txtUsrName = new Text(this, SWT.NONE);
				FormData txtUsrNameLData = new FormData();
				txtUsrNameLData.left =  new FormAttachment(0, 1000, 302);
				txtUsrNameLData.top =  new FormAttachment(0, 1000, 248);
				txtUsrNameLData.width = 191;
				txtUsrNameLData.height = 32;
				txtUsrName.setLayoutData(txtUsrNameLData);
			}
			{
				btnLogin = new Button(this, SWT.PUSH | SWT.CENTER);
				FormData button1LData = new FormData();
				button1LData.left =  new FormAttachment(0, 1000, 158);
				button1LData.top =  new FormAttachment(0, 1000, 416);
				button1LData.width = 124;
				button1LData.height = 53;
				button1LData.right =  new FormAttachment(1000, 1000, -618);
				button1LData.bottom =  new FormAttachment(1000, 1000, -131);
				btnLogin.setLayoutData(button1LData);
				btnLogin.setImage(SWTResourceManager.getImage("btn_img3.jpg"));
				btnLogin.setText("Login");
				btnLogin.setSelection(true);
				btnLogin.setFont(SWTResourceManager.getFont("Tw Cen MT Condensed Extra Bold", 16, 0, false, false));
				btnLogin.setBackground(SWTResourceManager.getColor(255, 0, 0));
				btnLogin.setForeground(SWTResourceManager.getColor(255, 0, 0));
				btnLogin.setBackgroundImage(SWTResourceManager.getImage("bcg2.jpg"));
				btnLogin.setCursor(SWTResourceManager.getCursor(SWT.CURSOR_HAND));
				btnLogin.setGrayed(true);
				
				
				btnLogin.addSelectionListener(new SelectionListener() {
					
					private String name;

					public void widgetSelected(SelectionEvent e) {
						// TODO Auto-generated method stubs
						getShell().setVisible(false);
						
						ConsultantMain cMain = new ConsultantMain(name);
						cMain.setVisible(true);
					}
					
					public void widgetDefaultSelected(SelectionEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				
				

				/*Device dev = getDisplay();
				int blue = SWT.COLOR_BLUE;
				int red = SWT.COLOR_DARK_RED;
				
				org.eclipse.swt.graphics.Color bl =SWTResourceManager.getColor(3,4,9);
				btnLogin.setBackground(bl);*/
				//btnLogin.setForeground(blue);
				/*//@SuppressWarnings("unused")
				btnLogin.addPaintListener(new PaintListener(){

					public void paintControl(PaintEvent e) {
						// TODO Auto-generated method stub
						//Device device = 
						
						org.eclipse.swt.graphics.Color c1 = new org.eclipse.swt.graphics.Color(e.display,50, 50, 200);						
						//e.gc.setForeground(c1);
						e.gc.setForeground(hex2Col("ffffcc"));
						//e.gc.drawText(e.gc.getBackground().toString(),0,0);
					}});
			}*/
			{
				btnReg = new Button(this, SWT.PUSH | SWT.CENTER);
				btnReg.setText("Register");
				btnReg.setImage(SWTResourceManager.getImage("btn_img3.jpg"));
				FormData button2LData = new FormData();
				button2LData.left =  new FormAttachment(0, 1000, 340);
				button2LData.top =  new FormAttachment(0, 1000, 416);
				button2LData.width = 134;
				button2LData.height = 53;
				btnReg.setLayoutData(button2LData);
				btnReg.setSelection(true);
				btnReg.setBackground(SWTResourceManager.getColor(255,0,0));
				btnReg.setForeground(SWTResourceManager.getColor(255,0,0));
				btnReg.setFont(SWTResourceManager.getFont("Tw Cen MT Condensed Extra Bold", 16, 0, false, false));
				btnReg.setBackgroundImage(SWTResourceManager.getImage("bcg2.jpg"));
				btnReg.setCursor(SWTResourceManager.getCursor(SWT.CURSOR_HAND));
				
				//final Display display1 = Display.getDefault();
				Display displayFront = Display.getCurrent();
				final Shell shellReg = new Shell(displayFront);
				shellReg.setSize(900, 620);
				
				//shell1.
				
						
				//final RegisterScreen rScrn = new RegisterScreen(get, getBackgroundMode());
				//rScrn.setVisible(false);
				
				btnReg.addSelectionListener(new SelectionListener() {
					
					public void widgetSelected(SelectionEvent e) {
						
						getShell().setVisible(false);
						shellReg.open();
						
						RegisterScreen rScrn = new RegisterScreen(shellReg, getBackgroundMode());
					
						
					}
					
					public void widgetDefaultSelected(SelectionEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
			}
			{
				lblPW = new Label(this, SWT.NONE);
				FormData label1LData = new FormData();
				label1LData.left =  new FormAttachment(0, 1000, 109);
				label1LData.top =  new FormAttachment(0, 1000, 314);
				label1LData.width = 120;
				label1LData.height = 32;
				lblPW.setLayoutData(label1LData);
				lblPW.setText("Password    :");
				lblPW.setFont(SWTResourceManager.getFont("Segoe UI Semibold", 15, 0, false, false));
				lblPW.setForeground(SWTResourceManager.getColor(255, 255, 255));
				lblPW.setBackgroundImage(SWTResourceManager.getImage("bcg.png"));
			}
			{
				FormData text1LData = new FormData();
				text1LData.left =  new FormAttachment(0, 1000, 302);
				text1LData.top =  new FormAttachment(0, 1000, 314);
				text1LData.width = 191;
				text1LData.height = 32;
				txtPass = new Text(this, SWT.NONE);
				txtPass.setLayoutData(text1LData);
			}

			this.layout();}
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
		LoginScreen inst = new LoginScreen(shell, SWT.NULL);
		//inst.setBackgroundImage(SWTResourceManager.getImage("bckg.jpg"));
		inst.setLayoutDeferred(true);
		Point size = inst.getSize();
		shell.setLayout(new FillLayout());
		//shell.setBackgroundImage(SWTResourceManager.getImage("bckg.jpg"));
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
