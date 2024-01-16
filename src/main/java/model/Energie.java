package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Connection.Co;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Energie{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idEnergie ; 
	String energie ; 

	public Energie(){}

	public Energie(Long idEnergie , String energie){
		this.idEnergie= idEnergie ; 
		this.energie= energie; 
	}

	@Override
	public String toString(){
		return "Energie { " +
		"id= "+idEnergie+ 
		" energie = " +energie+ '}';
	}

	public Long getIdEnergie() {
        return idEnergie;
    }

    public void setIdEnergie(Long idEnergie) {
        this.idEnergie = idEnergie;
    }

    public String getenergie() {
        return energie;
    }

    public void setenergie(String energie) {
        this.energie = energie;
    }

    public void supprimer() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "delete from energie where idEnergie=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, this.getIdEnergie());
        int rowsAffected = statement.executeUpdate();
        
        statement.close();
        connection.close();

    }

    public void modifier() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "UPDATE energie SET energie =? WHERE idEnergie=?  ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, this.getenergie());
        statement.setLong(2, this.getIdEnergie());
        int rowsAffected = statement.executeUpdate();

        statement.close();
        connection.close();
    }

    public void insert() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "insert into energie (energie)VALUES(?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        // Set the values of the parameters

        statement.setString(1, this.getenergie());

        // Execute the SQL statement
        int rowsAffected = statement.executeUpdate();

        // Close the connection
        statement.close();
        connection.close();
    }
}