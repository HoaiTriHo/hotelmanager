package BUS;

import DTO.Account_DTO;
import GUI.Online_GUI;

public class Online_BUS {
	public void getDataFromForm(Account_DTO dto, String _email, String _username, String _password) {
		dto.setEmail(_email);
		dto.setUserName(_username);
		dto.setPassWord(_password);
		dto.setPerMission(0);
	}

	public boolean checkData(String _email, String _username, String _password) {
		if (_email.isEmpty() || _username.isEmpty() || _password.isEmpty())
			return false;
		return true;
	}

	public boolean checkLength(String _username, String _password) {
		if (_username.length() < 6 && _password.length() < 6)
			return false;
		return true;
	}
}
