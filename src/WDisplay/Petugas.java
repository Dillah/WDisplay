/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WDisplay;
import java.sql.ResultSet;

/**
 *
 * @author USER
 */

public class Petugas {
	private String FirstName, LastName, Date, Gender, Username, Password, Address;
        
	public Petugas() {
	}
        
       /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }
    
       
        
        public void saveData(){
        Database db = new Database();
        String s;
        s = "insert into petugas values ('"+this.FirstName+"','"+this.LastName+"','"+this.Date+"','"+this.Gender+"','"+this.Username+"','"+this.Password+"','"+this.Address+"')";
        db.query(s);
        }
        public ResultSet getData(){
        ResultSet result = null;
        Database db= new Database();
        String s;
        s = "insert into petugas values ('"+this.FirstName+"','"+this.LastName+"','"+this.Date+"','"+this.Gender+"','"+this.Username+"','"+this.Password+"','"+this.Address+"')";
        db.query(s);
        return result;
        }    
        }
  