package eduCourse_prj.professor.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import eduCourse_prj.admin.dao.AdminAcadCalDAO;
import eduCourse_prj.admin.design.AdminAcadCalDesign;
import eduCourse_prj.professor.design.ProfAcadCalDesign;


public class ProfAcadCalEvent extends WindowAdapter implements ActionListener{
	
	ProfAcadCalDesign pacd;
	int i=0;
	
	public ProfAcadCalEvent(ProfAcadCalDesign pacd) {
		this.pacd = pacd;
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == pacd.getSearchBtn()) { //조회 버튼 클릭
			try {
				pacd.calSet();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(ae.getSource() == pacd.getJbtnCnfrm()) { //확인 버튼 클릭
			pacd.dispose();
		}
		
		
	}

	@Override
	public void windowClosing(WindowEvent we) {
		super.windowClosing(we);
	}
	
	
	
}
