package com.mycompany.Modelo;


@Entity
@Table(name = "persona")
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONA")
    private Integer idPersona;

    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;

    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;
    
    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;
    
    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;
    
    @Column(name = "CELULAR_PERSONA")
    private Integer celularPersona;
    
    @Column(name = "FECHA_NACIMIENTO")
    private Integer fechaNacimiento;
    
    @Column(name = "EMAIL_PERSONA")
    private Integer emailPersona;
    
    @Column(name = "TIPO")
    private Integer tipo;
    
    @OneToMany(mappedBy = "ID_PERSONA", cascade = CascadeType.ALL)
    private Set<Personas> listadoPersonas;

    public Persona() {
    }
    
    public Persona(Integer idPersona, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, Integer celularPersona, Integer fechaNacimiento, Integer emailPersona, Integer tipo, <any> listadoPersonas) {
        this.idPersona = idPersona;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.celularPersona = celularPersona;
        this.fechaNacimiento = fechaNacimiento;
        this.emailPersona = emailPersona;
        this.tipo = tipo;
        this.listadoPersonas = listadoPersonas;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public Integer getCelularPersona() {
        return celularPersona;
    }

    public void setCelularPersona(Integer celularPersona) {
        this.celularPersona = celularPersona;
    }

    public Integer getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Integer fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getEmailPersona() {
        return emailPersona;
    }

    public void setEmailPersona(Integer emailPersona) {
        this.emailPersona = emailPersona;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public <any> getListadoPersonas() {
        return listadoPersonas;
    }

    public void setListadoPersonas(<any> listadoPersonas) {
        this.listadoPersonas = listadoPersonas;
    }

}
