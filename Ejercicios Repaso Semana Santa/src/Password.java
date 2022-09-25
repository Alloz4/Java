
public class Password {
	private String contraseña;

	Password() {
		this.contraseña = generarPassword();
	}

	Password(String contraseña) {
		this.contraseña = contraseña;
	}

	public boolean esFuerte() {
		// Expresion regular que cumple las condiciones para que sea fuerte.

		String fuerte = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)([A-Za-z\\d$@$!%*?&]){8,}";
		return contraseña.matches(fuerte);
	}

	private String generarPassword() {
		String password = "";
		// Genero un n�mero aleatorio para que la longitud sea entre 10 y 15
		int longitud = (int) (Math.random() * (15 - 10 + 1) + 10);
		for (int i = 0; i < longitud; i++) {
			// Genero un n�mero aleatorio para que vaya a�adiendo un n�mero, may�scula o
			// min�scula.
			int pon = (int) (Math.random() * (3 - 1 + 1) + 1);
			if (pon == 1) {
				// Los n�meros que se generan se corresponden con las min�sculas en la tabla
				// ASCII
				char minus = (char) ((int) (Math.random() * (123 - 97 + 1) + 97));
				password += minus;
			} else {
				if (pon == 2) {
					// Los n�meros que se generan se corresponden con las may�sculas en la tabla
					// ASCII
					char mayus = (char) ((int) (Math.random() * (91 - 65 + 1) + 65));
					password += mayus;
				} else {
					// Los n�meros que se generan se corresponden con los n�meros en la tabla ASCII
					char nums = (char) ((int) (Math.random() * (58 - 48 + 1) + 48));
					password += nums;
				}
			}
		}
		return password;
	}

	public String getContraseña() {
		return contraseña;
	}

}
