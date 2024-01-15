package model;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Connection.Co;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class BoiteVitesse{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long idBoiteVitesse ; 
	String vitesse ; 

	public BoiteVitesse(){}

	public BoiteVitesse(Long idBoiteVitesse , String vitesse){
		this.idBoiteVitesse= idBoiteVitesse ; 
		this.vitesse= vitesse; 
	}

	@Override
	public String toString(){
		return "BoiteVitesse { " +
		"idBoiteVitesse= "+idBoiteVitesse+ 
		" vitesse = " +vitesse+ '}';
	}

	public Long getIdBoiteVitesse() {
        return idBoiteVitesse;
    }

    public void setIdBoiteVitesse(Long idBoiteVitesse) {
        this.idBoiteVitesse = idBoiteVitesse;
    }

    public String getVitesse() {
        return vitesse;
    }

    public void setVitesse(String vitesse) {
        this.vitesse = vitesse;
    }

    public void supprimer() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "delete from vitesse where idVitesse=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, this.getIdBoiteVitesse());
        int rowsAffected = statement.executeUpdate();

        statement.close();
        connection.close();

    }

    public void modifier() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "UPDATE vitesse SET vitesse =? WHERE idVitesse=?  ";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, this.getVitesse());
        statement.setLong(2, this.getIdBoiteVitesse());
        int rowsAffected = statement.executeUpdate();

        statement.close();
        connection.close();
    }

    public void insert() throws Exception {
        Connection connection = Co.getConnection();
        String sql = "insert into vitesse (vitesse)VALUES(?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        // Set the values of the parameters

        statement.setString(1, this.getVitesse());

        // Execute the SQL statement
        int rowsAffected = statement.executeUpdate();

        // Close the connection
        statement.close();
        connection.close();
    }
}