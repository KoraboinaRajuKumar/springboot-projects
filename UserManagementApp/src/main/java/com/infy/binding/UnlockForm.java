package com.infy.binding;

public class UnlockForm {

	private String email;

	private String tempwd;

	private String newPwd;

	private String confirmPwd;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTempwd() {
		return tempwd;
	}

	public void setTempwd(String tempwd) {
		this.tempwd = tempwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	@Override
	public String toString() {
		return "UnlockForm [email=" + email + ", tempwd=" + tempwd + ", newPwd=" + newPwd + ", confirmPwd=" + confirmPwd
				+ "]";
	}

}
