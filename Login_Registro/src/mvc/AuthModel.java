package mvc;

import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthModel {
	
	public AuthModel() {
		
	}

	public boolean login(String nombre, String contra) {
		
		boolean sesion = false;
		try {
            String filePath = "C:\\Users\\krip1\\Downloads\\users.json";
            FileReader reader = new FileReader(filePath);

            StringBuilder jsonString = new StringBuilder();
            int p;

            while ((p = reader.read()) != -1) {
                jsonString.append((char) p);
            }

            reader.close();

            JSONObject jsonObj = new JSONObject(jsonString.toString());
            JSONArray usersArray = jsonObj.getJSONArray("users");

            for (int i = 0; i < usersArray.length(); i++) {
                JSONObject userObj = usersArray.getJSONObject(i);
                String user = userObj.getString("username");
                String psw = userObj.getString("password");

                if (nombre.equals(user) && contra.equals(psw)) {
                    sesion = true;
                    break;
                }
            }

            if (sesion) {
            	JOptionPane.showMessageDialog(null, "Los datos coinciden con una cuenta", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
            	return true;
            } else {
                JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (IOException | JSONException e1) {
            e1.printStackTrace();
            JOptionPane.showMessageDialog(null, "No se pudo leer el archivo", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
		return false;
	}
}
