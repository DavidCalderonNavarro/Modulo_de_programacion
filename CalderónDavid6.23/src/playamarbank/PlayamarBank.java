package playamarbank;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * La clase {@code PlayamarBank} representa una cuenta bancaria del banco Playamar.
 * <p>
 * Cada cuenta dispone de un identificador único, un saldo, una fecha de creación,
 * un límite de descubierto y puede estar embargada con un determinado porcentaje.
 * </p>
 * <p>
 * La clase mantiene además información global compartida por todas las cuentas,
 * como el saldo global del banco, el número de cuentas embargadas y la fecha de
 * creación más reciente.
 * </p>
 */
public class PlayamarBank {

	// Atributos estáticos

	/** Límite de descubierto por defecto */
	private static double DEFAULT_MAX_DESCUBIERTO = 0.0;
	/** Saldo por defecto */
	private static double DEFAULT_SALDO = 0.0;
	/** Máximo descubierto permitido */
	private static double MAX_DESCUBIERTO = -2000.0;
	/** Porcentaje máximo de embargo */
	private static double MAX_EMBARGO = 100.0;
	/** Saldo máximo permitido */
	private static double MAX_SALDO = 5.0E7;
	/** Porcentaje mínimo de embargo */
	private static double MIN_EMBARGO = 0.0;
	/** Año mínimo permitido */
	private static int MIN_YEAR = 1900;
	/** Contador para generar identificadores únicos */
	private static long contadorId = 1;
	/** Saldo global de todas las cuentas */
	private static double saldoGlobal = 0;
	/** Número de cuentas embargadas */
	private static int numCuentasEmbargadas = 0;
	/** Fecha de creación más reciente */
	private static LocalDate fechaMasModerna;

	// Atributos de instancia

	/** Saldo inicial de la cuenta */
	private double saldoInicial;
	/** Fecha de creación de la cuenta */
	private LocalDate fechaCreacion;
	/** Límite de descubierto permitido */
	private double limiteDescubierto;

	/** Identificador único de la cuenta */
	private long id;
	/** Saldo actual de la cuenta */
	private double saldo;
	/** Saldo máximo alcanzado por la cuenta */
	private double saldoMaximo;
	/** Cantidad total ingresada en la cuenta */
	private double totalIngresado;

	/** Indica si la cuenta está embargada */
	private boolean embargada;
	/** Porcentaje de embargo aplicado */
	private double porcentajeEmbargo;

	// Constructores

	/**
	 * Constructor por defecto.
	 * Crea una cuenta bancaria con valores por defecto.
	 */
	public PlayamarBank() {
	}

	/**
	 * Constructor que crea una cuenta con un saldo inicial.
	 *
	 * @param saldoInicialp saldo inicial de la cuenta
	 * @throws IllegalArgumentException si el saldo inicial es negativo
	 */
	public PlayamarBank(double saldoInicialp) throws IllegalArgumentException {
		this(saldoInicialp, LocalDate.now(), DEFAULT_MAX_DESCUBIERTO);
	}

	/**
	 * Constructor que crea una cuenta con saldo inicial y fecha de creación.
	 *
	 * @param saldoInicialp saldo inicial de la cuenta
	 * @param fechaCreacionp fecha de creación de la cuenta
	 * @throws IllegalArgumentException si los parámetros no son válidos
	 */
	public PlayamarBank(double saldoInicialp, LocalDate fechaCreacionp)
			throws IllegalArgumentException {
		this(saldoInicialp, fechaCreacionp, DEFAULT_MAX_DESCUBIERTO);
	}

	/**
	 * Constructor que crea una cuenta con saldo inicial, fecha de creación
	 * y límite de descubierto.
	 *
	 * @param saldoInicialp saldo inicial de la cuenta
	 * @param fechaCreacionp fecha de creación de la cuenta
	 * @param limiteDescubiertop límite máximo de descubierto permitido
	 * @throws IllegalArgumentException si alguno de los parámetros no es válido
	 */
	public PlayamarBank(double saldoInicialp, LocalDate fechaCreacionp, double limiteDescubiertop)
			throws IllegalArgumentException {

		if (saldoInicialp < 0 || fechaCreacionp.isAfter(LocalDate.now())
				|| limiteDescubiertop > DEFAULT_MAX_DESCUBIERTO) {
			throw new IllegalArgumentException("Parámetros inválidos");
		}

		this.saldoInicial = saldoInicialp;
		this.fechaCreacion = fechaCreacionp;
		this.limiteDescubierto = limiteDescubiertop;
		this.porcentajeEmbargo = 0.0;
	}

	// Métodos

	/**
	 * Desembarga la cuenta si estaba embargada.
	 *
	 * @return {@code true} si la cuenta estaba embargada y se ha desembargado,
	 *         {@code false} en caso contrario
	 */
	public boolean desembargar() {

		if (embargada) {
			embargada = false;
			porcentajeEmbargo = 0;
			numCuentasEmbargadas--;
			return true;
		}

		return false;
	}

	/**
	 * Embarga la cuenta aplicando un porcentaje de embargo.
	 *
	 * @param porcentajeEmbargo porcentaje de embargo a aplicar
	 */
	public void embargar(double porcentajeEmbargo) {

		if (!embargada) {
			embargada = true;
			numCuentasEmbargadas++;
		}

		this.porcentajeEmbargo = porcentajeEmbargo;
	}

	/**
	 * Extrae una cantidad de dinero de la cuenta.
	 * <p>
	 * Si la cuenta está embargada, se aplica el porcentaje de embargo.
	 * </p>
	 *
	 * @param cantidad cantidad a extraer
	 */
	public void extraer(double cantidad) {

		if (cantidad <= 0) {
			return;
		}

		double cantidadReal = cantidad;

		if (embargada) {
			cantidadReal = cantidad * (1 - porcentajeEmbargo / 100);
		}

		saldo -= cantidadReal;
		saldoGlobal -= cantidadReal;
	}

	/**
	 * Obtiene la antigüedad de la cuenta en días.
	 *
	 * @return número de días desde la creación de la cuenta
	 */
	public long getDiasCuenta() {
		return ChronoUnit.DAYS.between(fechaCreacion, LocalDate.now());
	}

	/**
	 * Obtiene la fecha de creación de la cuenta.
	 *
	 * @return fecha de creación
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	/**
	 * Obtiene la fecha de creación más reciente entre todas las cuentas.
	 *
	 * @return fecha de la cuenta más moderna
	 */
	public static LocalDate getFechaMasModerna() {
		return fechaMasModerna;
	}

	/**
	 * Obtiene el identificador de la cuenta.
	 *
	 * @return identificador único
	 */
	public long getId() {
		return id;
	}

	/**
	 * Obtiene el límite de descubierto permitido.
	 *
	 * @return límite de descubierto
	 */
	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	/**
	 * Obtiene el número de cuentas embargadas actualmente.
	 *
	 * @return número de cuentas embargadas
	 */
	public static int getNumCuentasEmbargadas() {
		return numCuentasEmbargadas;
	}

	/**
	 * Obtiene el porcentaje de embargo aplicado a la cuenta.
	 *
	 * @return porcentaje de embargo
	 */
	public double getPorcentajeEmbargo() {
		return porcentajeEmbargo;
	}

	/**
	 * Obtiene el saldo actual de la cuenta.
	 *
	 * @return saldo actual
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Obtiene el saldo global del banco.
	 *
	 * @return saldo global
	 */
	public static double getSaldoGlobal() {
		return saldoGlobal;
	}

	/**
	 * Obtiene el saldo máximo alcanzado por la cuenta.
	 *
	 * @return saldo máximo
	 */
	public double getSaldoMaximo() {
		return saldoMaximo;
	}

	/**
	 * Obtiene el total ingresado en la cuenta.
	 *
	 * @return total ingresado
	 */
	public double getTotalIngresado() {
		return totalIngresado;
	}

	/**
	 * Ingresa una cantidad de dinero en la cuenta.
	 *
	 * @param cantidad cantidad a ingresar
	 */
	public void ingresar(double cantidad) {

		if (cantidad <= 0)
			return;

		saldo += cantidad;
		totalIngresado += cantidad;
		saldoGlobal += cantidad;

		if (saldo > saldoMaximo) {
			saldoMaximo = saldo;
		}
	}

	/**
	 * Indica si la cuenta está en descubierto.
	 *
	 * @return {@code true} si el saldo es negativo
	 */
	public boolean isDescubierta() {
		return saldo < 0;
	}

	/**
	 * Indica si la cuenta está embargada.
	 *
	 * @return {@code true} si la cuenta está embargada
	 */
	public boolean isEmbargada() {
		return embargada;
	}

	/**
	 * Devuelve una representación textual del estado de la cuenta.
	 *
	 * @return cadena con la información de la cuenta
	 */
	@Override
	public String toString() {
		return "Cuenta " + id + " | Saldo: " + saldo + " | Embargada: " + embargada
				+ " | Fecha creación: " + fechaCreacion;
	}

	/**
	 * Transfiere una cantidad de dinero a otra cuenta.
	 *
	 * @param cantidad cantidad a transferir
	 * @param destino cuenta destino
	 */
	public void transferir(double cantidad, PlayamarBank destino) {

		if (destino == null || cantidad <= 0) {
			return;
		}

		this.extraer(cantidad);
		destino.ingresar(cantidad);
	}

	/**
	 * Transfiere el saldo completo de la cuenta a otra cuenta.
	 *
	 * @param destino cuenta destino
	 */
	public void transferir(PlayamarBank destino) {

		if (destino == null) {
			return;
		}

		double cantidad = this.saldo;
		this.extraer(cantidad);
		destino.ingresar(cantidad);
	}
}
