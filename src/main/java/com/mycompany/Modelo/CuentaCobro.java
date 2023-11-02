
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author camac
 */
@Entity
@Table(name = "cuenta_cobro")
public class CuentaCobro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CUENTA_COBRO")
    private Integer idCuentaCobro;

    @Column(name = "ID_UNICO_RESIDENTE")
    private Integer idUnicoResidente;
    
    @Column(name = "ID_RESIDENTE")
    private Integer idResidente;
    
    @Column(name = "ID_APARTAMENTO_RESIDENTE")
    private Integer idApartamentoResidente;
    
    @Column(name = "ID_UNICO_PROPIETARIO")
    private Integer idUnicoPropietario;
    
    @Column(name = "ID_PROPIETARIO")
    private Integer idPropietario;
    
    @Column(name = "ID_APARTAMENTO_PROPIETARIO")
    private Integer idApartamentoPropietario;
    
    @ManyToOne
    @JoinColumn(name = "NUMERO_CONCEPTO")
    private Integer numeroConcepto;
    
    @Column(name = "VALOR_COBRO")
    private Float valorCobro;
    
    @Column(name = "FECHA_NACIMIENTO")
    private Date valorCobro;
    
    @OneToMany(mappedBy = "NUMERO_CONCEPTO", cascade = CascadeType.ALL)
    private Set<CuentasCobro> listadoCuentasCobro;

    public CuentaCobro() {
    }

    public CuentaCobro(Integer idCuentaCobro, Integer idUnicoResidente, Integer idResidente, Integer idApartamentoResidente, Integer idUnicoPropietario, Integer idPropietario, Integer idApartamentoPropietario, Integer numeroConcepto, Float valorCobro, Date valorCobro, <any> listadoCuentasCobro) {
        this.idCuentaCobro = idCuentaCobro;
        this.idUnicoResidente = idUnicoResidente;
        this.idResidente = idResidente;
        this.idApartamentoResidente = idApartamentoResidente;
        this.idUnicoPropietario = idUnicoPropietario;
        this.idPropietario = idPropietario;
        this.idApartamentoPropietario = idApartamentoPropietario;
        this.numeroConcepto = numeroConcepto;
        this.valorCobro = valorCobro;
        this.valorCobro = valorCobro;
        this.listadoCuentasCobro = listadoCuentasCobro;
    }

    public Integer getIdCuentaCobro() {
        return idCuentaCobro;
    }

    public void setIdCuentaCobro(Integer idCuentaCobro) {
        this.idCuentaCobro = idCuentaCobro;
    }

    public Integer getIdUnicoResidente() {
        return idUnicoResidente;
    }

    public void setIdUnicoResidente(Integer idUnicoResidente) {
        this.idUnicoResidente = idUnicoResidente;
    }

    public Integer getIdResidente() {
        return idResidente;
    }

    public void setIdResidente(Integer idResidente) {
        this.idResidente = idResidente;
    }

    public Integer getIdApartamentoResidente() {
        return idApartamentoResidente;
    }

    public void setIdApartamentoResidente(Integer idApartamentoResidente) {
        this.idApartamentoResidente = idApartamentoResidente;
    }

    public Integer getIdUnicoPropietario() {
        return idUnicoPropietario;
    }

    public void setIdUnicoPropietario(Integer idUnicoPropietario) {
        this.idUnicoPropietario = idUnicoPropietario;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public Integer getIdApartamentoPropietario() {
        return idApartamentoPropietario;
    }

    public void setIdApartamentoPropietario(Integer idApartamentoPropietario) {
        this.idApartamentoPropietario = idApartamentoPropietario;
    }

    public Integer getNumeroConcepto() {
        return numeroConcepto;
    }

    public void setNumeroConcepto(Integer numeroConcepto) {
        this.numeroConcepto = numeroConcepto;
    }

    public Float getValorCobro() {
        return valorCobro;
    }

    public void setValorCobro(Float valorCobro) {
        this.valorCobro = valorCobro;
    }

    public Date getValorCobro() {
        return valorCobro;
    }

    public void setValorCobro(Date valorCobro) {
        this.valorCobro = valorCobro;
    }

    public <any> getListadoCuentasCobro() {
        return listadoCuentasCobro;
    }

    public void setListadoCuentasCobro(<any> listadoCuentasCobro) {
        this.listadoCuentasCobro = listadoCuentasCobro;
    }
    
    
}
