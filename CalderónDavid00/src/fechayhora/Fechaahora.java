package fechayhora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Fechaahora {

	public static void main(String[] args) {
		
		LocalTime ahora = LocalTime.now();
		LocalDate ahora2 = LocalDate.now();
		
		System.out.println(ahora);
		System.out.println(ahora2);
		
		LocalDateTime dateTime = LocalDateTime.of(ahora2, ahora);
		System.out.println(dateTime);

	}

}
