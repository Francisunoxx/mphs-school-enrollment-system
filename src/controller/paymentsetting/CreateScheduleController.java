/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.paymentsetting;

import daoimpl.PaymentTermDaoImpl;
import daoimpl.PeriodDaoImpl;
import daoimpl.SchoolYearDaoImpl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Monthly;
import model.PaymentTerm;
import model.Period;
import model.Quarterly;
import model.Semestral;

/**
 *
 * @author John Ferdinand Antonio
 */
public class CreateScheduleController implements ActionListener{

    private final JComboBox syFromSelected;
    private final JComboBox syToSelected;
    private final JComboBox sem1Year;
    private final JComboBox sem2Year;
    private final JComboBox q1Year;
    private final JComboBox q2Year;
    private final JComboBox q3Year;
    private final JComboBox q4Year;
    private final JComboBox mo1Year;
    private final JComboBox mo2Year;
    private final JComboBox mo3Year;
    private final JComboBox mo4Year;
    private final JComboBox mo5Year;
    private final JComboBox mo6Year;
    private final JComboBox mo7Year;
    private final JComboBox mo8Year;
    private final JComboBox mo9Year;
    private final JComboBox mo10Year;
    
    private final JComboBox sem1Month;
    private final JComboBox sem2Month;
    private final JComboBox q1Month;
    private final JComboBox q2Month;
    private final JComboBox q3Month;
    private final JComboBox q4Month;
    private final JComboBox mo1Month;
    private final JComboBox mo2Month;
    private final JComboBox mo3Month;
    private final JComboBox mo4Month;
    private final JComboBox mo5Month;
    private final JComboBox mo6Month;
    private final JComboBox mo7Month;
    private final JComboBox mo8Month;
    private final JComboBox mo9Month;
    private final JComboBox mo10Month;
    
    private final JComboBox sem1Day;
    private final JComboBox sem2Day;
    private final JComboBox q1Day;
    private final JComboBox q2Day;
    private final JComboBox q3Day;
    private final JComboBox q4Day;
    private final JComboBox mo1Day;
    private final JComboBox mo2Day;
    private final JComboBox mo3Day;
    private final JComboBox mo4Day;
    private final JComboBox mo5Day;
    private final JComboBox mo6Day;
    private final JComboBox mo7Day;
    private final JComboBox mo8Day;
    private final JComboBox mo9Day;
    private final JComboBox mo10Day;
    
    private final JTextField semestralLateFee;
    private final JTextField quarterlyLateFee;
    private final JTextField monthlyLateFee;
    
    private SchoolYearDaoImpl schoolYearDaoImpl = new SchoolYearDaoImpl();
    private PaymentTermDaoImpl paymentTermDaoImpl = new PaymentTermDaoImpl();
    private PeriodDaoImpl periodDaoImpl = new PeriodDaoImpl();
    
    public CreateScheduleController(
            JComboBox syFromSelected, JComboBox syToSelected,
            JComboBox sem1Year, JComboBox sem2Year,
            JComboBox q1Year, JComboBox q2Year, JComboBox q3Year, JComboBox q4Year,
            JComboBox mo1Year, JComboBox mo2Year, JComboBox mo3Year, JComboBox mo4Year, JComboBox mo5Year,
            JComboBox mo6Year, JComboBox mo7Year, JComboBox mo8Year, JComboBox mo9Year, 
            JComboBox mo10Year,
            
            JComboBox sem1Month, JComboBox sem2Month,
            JComboBox q1Month, JComboBox q2Month, JComboBox q3Month, JComboBox q4Month,
            JComboBox mo1Month,JComboBox mo2Month,JComboBox mo3Month,JComboBox mo4Month,JComboBox mo5Month,
            JComboBox mo6Month,JComboBox mo7Month,JComboBox mo8Month,JComboBox mo9Month,
            JComboBox mo10Month,
            
            JComboBox sem1Day, JComboBox sem2Day,
            JComboBox q1Day, JComboBox q2Day, JComboBox q3Day, JComboBox q4Day,
            JComboBox mo1Day,JComboBox mo2Day,JComboBox mo3Day,JComboBox mo4Day,JComboBox mo5Day,
            JComboBox mo6Day,JComboBox mo7Day,JComboBox mo8Day,JComboBox mo9Day,
            JComboBox mo10Day,
            
            JTextField semestralLateFee, JTextField quarterlyLateFee, JTextField monthlyLateFee) {
        
        this.syFromSelected = syFromSelected;
        this.syToSelected = syToSelected;
        
        this.sem1Year = sem1Year;
        this.sem2Year = sem2Year;
        
        this.q1Year = q1Year;
        this.q2Year = q2Year;
        this.q3Year = q3Year;
        this.q4Year = q4Year;
        
        this.mo1Year = mo1Year;
        this.mo2Year = mo2Year;
        this.mo3Year = mo3Year;
        this.mo4Year = mo4Year;
        this.mo5Year = mo5Year;
        this.mo6Year = mo6Year;
        this.mo7Year = mo7Year;
        this.mo8Year = mo8Year;
        this.mo9Year = mo9Year;
        this.mo10Year = mo10Year;
        
        this.sem1Month = sem1Month;
        this.sem2Month = sem2Month;
        
        this.q1Month = q1Month;
        this.q2Month = q2Month;
        this.q3Month = q3Month;
        this.q4Month = q4Month;
        
        this.mo1Month = mo1Month;
        this.mo2Month = mo2Month;
        this.mo3Month = mo3Month;
        this.mo4Month = mo4Month;
        this.mo5Month = mo5Month;
        this.mo6Month = mo6Month;
        this.mo7Month = mo7Month;
        this.mo8Month = mo8Month;
        this.mo9Month = mo9Month;
        this.mo10Month = mo10Month;
        
        this.sem1Day = sem1Day;
        this.sem2Day = sem2Day;
        
        this.q1Day = q1Day;
        this.q2Day = q2Day;
        this.q3Day = q3Day;
        this.q4Day = q4Day;
        
        this.mo1Day = mo1Day;
        this.mo2Day = mo2Day;
        this.mo3Day = mo3Day;
        this.mo4Day = mo4Day;
        this.mo5Day = mo5Day;
        this.mo6Day = mo6Day;
        this.mo7Day = mo7Day;
        this.mo8Day = mo8Day;
        this.mo9Day = mo9Day;
        this.mo10Day = mo10Day;
        
        this.semestralLateFee = semestralLateFee;
        this.quarterlyLateFee = quarterlyLateFee;
        this.monthlyLateFee = monthlyLateFee;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int choice = JOptionPane.showConfirmDialog(null, "Create Payment Schedule?", "Create", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            createSchedule();
        }
    }
    
    private void createSchedule() {
        List<PaymentTerm> paymentTerms = new ArrayList<>();
        paymentTerms.add(getSemestral());
        paymentTerms.add(getQuarterly());
        paymentTerms.add(getMonthly());
        
        boolean isAdded = paymentTermDaoImpl.addPaymentDeadline(paymentTerms);
        if(isAdded){
            JOptionPane.showMessageDialog(null,"Successfully created schedule.");
        }else{
            JOptionPane.showMessageDialog(null,"Error encountered. ");
        }
    }
    
    private Date convertToDate(JComboBox year, JComboBox month, JComboBox day){
        int yyyy = Integer.parseInt(year.getSelectedItem().toString().trim());
        int mm = Integer.parseInt(month.getSelectedItem().toString().trim());
        int dd = Integer.parseInt(day.getSelectedItem().toString().trim());
        String strDate = yyyy + "-" + (mm+1) + "-" + dd;
        Date date = java.sql.Date.valueOf(strDate);
        return date;
    }
    
    private Semestral getSemestral(){
        int schoolYearId = schoolYearDaoImpl.getId(Integer.parseInt(syFromSelected.getSelectedItem().toString()));

        Date sem1Deadline = convertToDate(sem1Year, sem1Month, sem1Day);
        Date sem2Deadline = convertToDate(sem2Year, sem2Month, sem2Day);
        
        Period firstSemester = new Period();
        firstSemester.setPaymentDeadline(sem1Deadline);
        firstSemester.setDescription("First Semester");
        
        Period secondSemester = new Period();
        secondSemester.setPaymentDeadline(sem2Deadline);
        secondSemester.setDescription("Second Semester");
        
        List<Period> semestralPeriods = new ArrayList<>();
        semestralPeriods.add(firstSemester);
        semestralPeriods.add(secondSemester);
        
        Semestral semestral = new Semestral();
        semestral.setPaymentTermId(paymentTermDaoImpl.getId("semestral"));
        semestral.setSchoolYearId(schoolYearId);
        semestral.setPeriods(semestralPeriods);
        
        return semestral;
    }
    
    private Quarterly getQuarterly(){
        int schoolYearId = schoolYearDaoImpl.getId(Integer.parseInt(syFromSelected.getSelectedItem().toString()));
        String FIRST_QUARTER = "First Quarter";
        String SECOND_QUARTER = "Second Quarter";
        String THIRD_QUARTER = "Third Quarter";
        String FOURTH_QUARTER = "Fourth Quarter";
        
        Date q1Deadline = convertToDate(q1Year, q1Month, q1Day);
        Date q2Deadline = convertToDate(q2Year, q2Month, q2Day);
        Date q3Deadline = convertToDate(q3Year, q3Month, q3Day);
        Date q4Deadline = convertToDate(q4Year, q4Month, q4Day);
        
        Period q1Period = new Period();
        q1Period.setPaymentDeadline(q1Deadline);
        q1Period.setDescription(FIRST_QUARTER);
        
        Period q2Period = new Period();
        q2Period.setPaymentDeadline(q2Deadline);
        q2Period.setDescription(SECOND_QUARTER);
        
        Period q3Period = new Period();
        q3Period.setPaymentDeadline(q3Deadline);
        q3Period.setDescription(THIRD_QUARTER);
        
        Period q4Period = new Period();
        q4Period.setPaymentDeadline(q4Deadline);
        q4Period.setDescription(FOURTH_QUARTER);
        
        List<Period> periods = new ArrayList<>();
        periods.add(q1Period);
        periods.add(q2Period);
        periods.add(q3Period);
        periods.add(q4Period);
        
        Quarterly quarterly = new Quarterly();
        quarterly.setPaymentTermId(paymentTermDaoImpl.getId("quarterly"));
        quarterly.setSchoolYearId(schoolYearId);
        quarterly.setPeriods(periods);
        
        return quarterly;
    }
    
    private Monthly getMonthly(){
        int schoolYearId = schoolYearDaoImpl.getId(Integer.parseInt(syFromSelected.getSelectedItem().toString()));
        
        Date firstMonthDeadline = convertToDate(mo1Year, mo1Month, mo1Day);
        Date secondMonthDeadline = convertToDate(mo2Year, mo2Month, mo2Day);
        Date thirdMonthDeadline = convertToDate(mo3Year, mo3Month, mo3Day);
        Date fourthMonthDeadline = convertToDate(mo4Year, mo4Month, mo4Day);
        Date fifthMonthDeadline = convertToDate(mo5Year, mo5Month, mo5Day);
        Date sixthMonthDeadline = convertToDate(mo6Year, mo6Month, mo6Day);
        Date seventhMonthDeadline = convertToDate(mo7Year, mo7Month, mo7Day);
        Date eighthMonthDeadline = convertToDate(mo8Year, mo8Month, mo8Day);
        Date ninthMonthDeadline = convertToDate(mo9Year, mo9Month, mo9Day);
        Date tenthMonthDeadline = convertToDate(mo10Year, mo10Month, mo10Day);
        
        Period firstMonth = new Period();
        firstMonth.setPaymentDeadline(firstMonthDeadline);
        firstMonth.setDescription("First Month");
        
        Period secondMonth = new Period();
        secondMonth.setPaymentDeadline(secondMonthDeadline);
        secondMonth.setDescription("Second Month");
        
        Period thirdMonth = new Period();
        thirdMonth.setPaymentDeadline(thirdMonthDeadline);
        thirdMonth.setDescription("Third Month");
        
        Period fourthMonth = new Period();
        fourthMonth.setPaymentDeadline(fourthMonthDeadline);
        fourthMonth.setDescription("Fourth Month");
        
        Period fifthMonth = new Period();
        fifthMonth.setPaymentDeadline(fifthMonthDeadline);
        fifthMonth.setDescription("Fifth Month");
        
        Period sixthMonth = new Period();
        sixthMonth.setPaymentDeadline(sixthMonthDeadline);
        sixthMonth.setDescription("Sixth Month");
        
        Period seventhMonth = new Period();
        seventhMonth.setPaymentDeadline(seventhMonthDeadline);
        seventhMonth.setDescription("Seventh Month");
        
        Period eighthMonth = new Period();
        eighthMonth.setPaymentDeadline(eighthMonthDeadline);
        eighthMonth.setDescription("Eighth Month");
        
        Period ninthMonth = new Period();
        ninthMonth.setPaymentDeadline(ninthMonthDeadline);
        ninthMonth.setDescription("Ninth Month");
        
        Period tenthMonth = new Period();
        tenthMonth.setPaymentDeadline(tenthMonthDeadline);
        tenthMonth.setDescription("Tenth Month");
        
        List<Period> periods = new ArrayList<>();
        periods.add(firstMonth);
        periods.add(secondMonth);
        periods.add(thirdMonth);
        periods.add(fourthMonth);
        periods.add(fifthMonth);
        periods.add(sixthMonth);
        periods.add(seventhMonth);
        periods.add(eighthMonth);
        periods.add(ninthMonth);
        periods.add(tenthMonth);
        
        Monthly monthly = new Monthly();
        monthly.setPaymentTermId(paymentTermDaoImpl.getId("monthly"));
        monthly.setSchoolYearId(schoolYearId);
        monthly.setPeriods(periods);
        
        return monthly;
    }
    
}
