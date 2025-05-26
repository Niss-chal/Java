/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marksapp.controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import marksapp.dao.UserDao;
import marksapp.model.UserData;
import marksapp.view.RegisterView;

/**
 *
 * @author loq
 */
public class RegisterController {
    RegisterView view = new RegisterView();
    public RegisterController(RegisterView view){
        this.view=view;
        RegisterUser register= new RegisterUser();
        this.view.registerUser(register);
    }
    public void open(){
        view.setVisible(true);
    }
    public void close(){
        view.dispose();
    }
    
    class RegisterUser implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            String name=view.getNameRegister().getText();
            String email=view.getEmailRegister().getText();
            String password=String.valueOf(view.getPassRegister().getPassword());
            String confirmPassword=String.valueOf(view.getConfirmPassRegister().getPassword());
            
            if(name.isEmpty() || email.isEmpty()|| password.isEmpty()||confirmPassword.isEmpty()){
                JOptionPane.showMessageDialog(view,"Fill in all the fields");
            }
            else if(!password.equals(confirmPassword)){
                JOptionPane.showMessageDialog(view,"Password do not match");
            }
            
            UserDao userDao=new UserDao();
            UserData user = new UserData(name,email,password);
            boolean result = userDao.register(user);
            if(result){
                JOptionPane.showMessageDialog(view,"Registered Successfully");
            }
            else{
                JOptionPane.showMessageDialog(view,"Registration Failed");
            }
        }
        
    }
    
}
