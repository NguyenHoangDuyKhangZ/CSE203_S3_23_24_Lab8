/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1_SingletonPattern;

/**
 *
 * @author copbu
 */
public class SingletonPattern {
    public static void main(String[] args) {
        //Get the instance of CompanyInfor
        CompanyInfor companyInfor =CompanyInfor.getInstance();
        
        //Display the company information
        companyInfor.displayInfor();
        
        //Update the company information
        companyInfor.setCompanyName("EIU-Đại học quốc tế Miền Đông");
        companyInfor.setAddress("3M38+6F3, Nam Kỳ Khởi Nghĩa, Định Hoà, Thủ Dầu Một, Bình Dương");
        companyInfor.setPhoneNumber("(+84) 0274 222 0372");
    
        //Display the updated company information
        companyInfor.displayInfor();
    }
    
    
}
