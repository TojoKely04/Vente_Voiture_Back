package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Connection.Co;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Marque{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idMarque ; 
	String marque ; 

	public Marque(){}

	public Marque(Long idMarque , String marque){
		this.idMarque= idMarque ; 
		this.= marque; 
	}

	@Override
	public String toString(){
		return "Marque { " +
		"id= "+idMarque+ 
		" marque = " +marque+ '}';
	}

	public Long getIdMarque() {
        return idMarque;
    }

    public void setIdMarque(Long idMarque) {
        this.idMarque = idMarque;
    }

    public String getmarque() {
        return marque;
    }

    public void setmarque(String marque) {
        this.marque = marque;
    }

    public void supprimer() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "delete from Marque where idMarque=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, this.getIdMarque());
        int rowsAffected = statement.executeUpdate();

        statement.close();
        connection.close();

    }

    public void modifier() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "UPDATE Marque SET marque =? WHERE idMarque=?  ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, this.getmarque());
        statement.setLong(2, this.getIdMarque());
        int rowsAffected = statement.executeUpdate();

        statement.close();
        connection.close();
    }

    public void insert() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "insert into marque (marque)VALUES(?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        // Set the values of the parameters

        statement.setString(1, this.getmarque());

        // Execute the SQL statement
        int rowsAffected = statement.executeUpdate();

        // Close the connection
        statement.close();
        connection.close();
    }
}