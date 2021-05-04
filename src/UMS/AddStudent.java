///Importing various important libraries
package UMS;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
///Declaring names of frames, labels, textfields, buttons and DropDown boxes.
class AddStudent implements ActionListener{
    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;
    JComboBox c1,c2; 
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);
    public AddStudent() {  
        ///Creating a frame for adding a student with image
        f = new JFrame("Add Student");
        f.setBackground(Color.white);
        f.setLayout(null);
        id15=new JLabel();
        id15.setBounds(0,0,900,700);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("UMS/icons/fourth.jpg"));
        Image i3 = img.getImage().getScaledInstance(1220, 700,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id15.setIcon(icc3);   
        ///New Label for New Student Details.
        id8 = new JLabel("New Student Details");
        id8.setBounds(320,30,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,25));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);   
        ///New Label for Name of new Student.
        id1 = new JLabel("Name");
        id1.setBounds(50,150,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);  
        ///Text Field for Name of the Student.
        t1=new JTextField();
        t1.setBounds(200,150,150,30);
        id15.add(t1);   
        ///New Label for Father's Name.
        id2 = new JLabel("Last Name");
        id2.setBounds(400,150,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);  
        ///Text Field for Father's Name
        t2=new JTextField();
        t2.setBounds(600,150,150,30);
        id15.add(t2);
        ///New Label for Age
        id3= new JLabel("Age");
        id3.setBounds(50,200,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);   
        ///Text Field for Age
        t3=new JTextField();
        t3.setBounds(200,200,150,30);
        id15.add(t3);  
        /// New Label for Date Of Birth
        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,200,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);
        ///Text Field for Date Of Birth
        t4=new JTextField();
        t4.setBounds(600,200,150,30);
        id15.add(t4); 
        ///New Label for Address
        id5= new JLabel("Address");
        id5.setBounds(50,250,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);
        ///Text Field for Address
        t5=new JTextField();
        t5.setBounds(200,250,150,30);
        id15.add(t5);
        ///New Label for Phone
        id6= new JLabel("Phone");
        id6.setBounds(400,250,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);   
        ///Text Field for Phone
        t6=new JTextField();
        t6.setBounds(600,250,150,30);
        id15.add(t6);
        ///New Label for Email ID
        id7= new JLabel("Email Id");
        id7.setBounds(50,300,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);
        ///Text Field for Email ID
        t7=new JTextField();
        t7.setBounds(200,300,150,30);
        id15.add(t7);
        ///New Label for 10th percentage
        id9= new JLabel("Class X(%)");
        id9.setBounds(400,300,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        id15.add(id9);
        ///Text Field for 10th percentage
        t8=new JTextField();
        t8.setBounds(600,300,150,30);
        id15.add(t8);
        /// New Label for 12th percentage
        id10= new JLabel("Class XII(%)");
        id10.setBounds(50,350,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);
        /// Text Field for 12th percentage
        t9=new JTextField();
        t9.setBounds(200,350,150,30);
        id15.add(t9);
        /// New Label for Adhaar Number    
        id11= new JLabel("Aadhar No");
        id11.setBounds(400,350,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);
        /// Text Field for Adhaar Number
        t10=new JTextField();
        t10.setBounds(600,350,150,30);
        id15.add(t10);
        /// New Label for Roll Number    
        id12= new JLabel("Roll No");
        id12.setBounds(50,400,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);
        ///Text Field for Roll Number
        t11=new JTextField();   
        t11.setBounds(200,400,150,30);
        t11.setText("111"+first);
        id15.add(t11);
        ///New Label for Course
        lab=new JLabel("Course");
        lab.setBounds(400,400,150,30);
        lab.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab);
        ///Drop Down Menu for Courses
        String course[] = {"B.Tech","BBA","BCA","Bsc","Msc","MBA","MCA","BA","BCom"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(600,400,150,30);
        id15.add(c1);
        /// New Label for Branch
        lab2=new JLabel("Branch");
        lab2.setBounds(50,450,150,30);
        lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);
        /// Drop Down for Branch
        String branch[] = {"Computer Science","Electronics","Electrical","Mechanical","Civil"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,450,150,30);
        id15.add(c2);
        /// Button for Submitting the entered details
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(250,550,150,40);  
        id15.add(b);
        /// Button for Caneling the entering details
        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,550,150,40);        
        id15.add(b1);
        ///Adding the action to the buttons created
        b.addActionListener(this);
        b1.addActionListener(this);  
        /// Making the frame visible
        f.setVisible(true);
        f.setSize(900,700);
        f.setLocation(400,150);
    }
    public void actionPerformed(ActionEvent ae){        
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText(); 
        ///String l and m are used to store the item selected from the drop down menu.
        String l = (String)c1.getSelectedItem();
        String m = (String)c2.getSelectedItem(); 
        if(ae.getSource() == b){
            try{
                conn cc = new conn();
                String q = "insert into student values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully");
                f.setVisible(false);
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            new Project().setVisible(true);     
        }
    }
    public static void main(String[ ] arg){
        new AddStudent().f.setVisible(true);
    }
}
