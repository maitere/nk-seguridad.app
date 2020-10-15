package com.nkseguridad.app.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="articulo",schema="public")
public class Articulo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private String codigo;
	private Long codmarca;
	private Long codfamilia;
	private String pro_codigo;
	private String abrevunidadmedida;
	private String codgrupoarticulo;
	private String nomarticulo;
	private Double preciosugerido;
	private Double stockminimo;
	private Double stockmaximo;
	private Double puntoreorden;
	private String codigobarraprincipal;
	private String origen;
	private Byte imagen;
	private String nombimagen;
    private String status;
    private Double alto;
    private Double ancho;
    private Boolean compuesto;
    private Double costodirecto;
    private Double costoreferencial;
    private Double costoreposicion;
    private String descripcionlarga;
    private Boolean empacado;
    private Boolean fraccionado;
    private Boolean facturable;
    private Double pctdescuento;
    private Double peso;
    private Double profundidad;
    private Boolean serializado;
    private Boolean sinexistencia;
    private String tipoarticulo;
    private String tipocosto;
    private String ubicacion;
    private Double ultimocosto;
    private Double costoreal;
    private Double descuentoprov1;
    private Double descuentoprov2;
    private Double descuentoprov3;
    private Double descuentoprov4;
    private Double costobase;
    private String tipodescuento;
    private Boolean usacesta;
    private Boolean precioporempaque;
    private String  codtipoiva;
    private Long codtipislr;
    private Long codmoneda;
    private Long codpresentacion;
    private Long codtipo;
    private Long codsabor;
    private String codnegocio;
    private String codvendedor;
    private Long codlinea;
    private Boolean aplicalista;
    private Double merma;
    private Double cantreorden;
    private Boolean despostable;
    private String serial;
    private String fechaultcompra;
    private String color;
    private String nombrefamilia;
    private String nombregrupoarticulo;
    private String nombreunidadmedida;
    private String nombremarca;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codfamilia",  insertable = false, updatable = false)
    private Familia familia;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codmarca",  insertable = false, updatable = false)
    private Marca marca;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "abrevunidadmedida",  insertable = false, updatable = false)
    private Unidadmedida unidadmedida;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codgrupoarticulo",  insertable = false, updatable = false)
    private GrupoArticulo grupoarticulo;
    
	public GrupoArticulo getGrupoarticulo() {
		return grupoarticulo;
	}
	public void setGrupoarticulo(GrupoArticulo grupoarticulo) {
		this.grupoarticulo = grupoarticulo;
	}
	public Unidadmedida getUnidadmedida() {
		return unidadmedida;
	}
	public void setUnidadmedida(Unidadmedida unidadmedida) {
		this.unidadmedida = unidadmedida;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public Familia getFamilia() {
		return familia;
	}
	public void setFamilia(Familia familia) {
		this.familia = familia;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Long getCodmarca() {
		return codmarca;
	}
	public void setCodmarca(Long codmarca) {
		this.codmarca = codmarca;
	}
	public Long getCodfamilia() {
		return codfamilia;
	}
	public void setCodfamilia(Long codfamilia) {
		this.codfamilia = codfamilia;
	}
	public String getPro_codigo() {
		return pro_codigo;
	}
	public void setPro_codigo(String pro_codigo) {
		this.pro_codigo = pro_codigo;
	}
	public String getAbrevunidadmedida() {
		return abrevunidadmedida;
	}
	public void setAbrevunidadmedida(String abrevunidadmedida) {
		this.abrevunidadmedida = abrevunidadmedida;
	}
	public String getCodgrupoarticulo() {
		return codgrupoarticulo;
	}
	public void setCodgrupoarticulo(String codgrupoarticulo) {
		this.codgrupoarticulo = codgrupoarticulo;
	}
	public String getNomarticulo() {
		return nomarticulo;
	}
	public void setNomarticulo(String nomarticulo) {
		this.nomarticulo = nomarticulo;
	}
	public Double getPreciosugerido() {
		return preciosugerido;
	}
	public void setPreciosugerido(Double preciosugerido) {
		this.preciosugerido = preciosugerido;
	}
	public Double getStockminimo() {
		return stockminimo;
	}
	public void setStockminimo(Double stockminimo) {
		this.stockminimo = stockminimo;
	}
	public Double getStockmaximo() {
		return stockmaximo;
	}
	public void setStockmaximo(Double stockmaximo) {
		this.stockmaximo = stockmaximo;
	}
	public Double getPuntoreorden() {
		return puntoreorden;
	}
	public void setPuntoreorden(Double puntoreorden) {
		this.puntoreorden = puntoreorden;
	}
	public String getCodigobarraprincipal() {
		return codigobarraprincipal;
	}
	public void setCodigobarraprincipal(String codigobarraprincipal) {
		this.codigobarraprincipal = codigobarraprincipal;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public Byte getImagen() {
		return imagen;
	}
	public void setImagen(Byte imagen) {
		this.imagen = imagen;
	}
	public String getNombimagen() {
		return nombimagen;
	}
	public void setNombimagen(String nombimagen) {
		this.nombimagen = nombimagen;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getAlto() {
		return alto;
	}
	public void setAlto(Double alto) {
		this.alto = alto;
	}
	public Double getAncho() {
		return ancho;
	}
	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}
	public Boolean getCompuesto() {
		return compuesto;
	}
	public void setCompuesto(Boolean compuesto) {
		this.compuesto = compuesto;
	}
	public Double getCostodirecto() {
		return costodirecto;
	}
	public void setCostodirecto(Double costodirecto) {
		this.costodirecto = costodirecto;
	}
	public Double getCostoreferencial() {
		return costoreferencial;
	}
	public void setCostoreferencial(Double costoreferencial) {
		this.costoreferencial = costoreferencial;
	}
	public Double getCostoreposicion() {
		return costoreposicion;
	}
	public void setCostoreposicion(Double costoreposicion) {
		this.costoreposicion = costoreposicion;
	}
	public String getDescripcionlarga() {
		return descripcionlarga;
	}
	public void setDescripcionlarga(String descripcionlarga) {
		this.descripcionlarga = descripcionlarga;
	}
	public Boolean getEmpacado() {
		return empacado;
	}
	public void setEmpacado(Boolean empacado) {
		this.empacado = empacado;
	}
	public Boolean getFraccionado() {
		return fraccionado;
	}
	public void setFraccionado(Boolean fraccionado) {
		this.fraccionado = fraccionado;
	}
	public Boolean getFacturable() {
		return facturable;
	}
	public void setFacturable(Boolean facturable) {
		this.facturable = facturable;
	}
	public Double getPctdescuento() {
		return pctdescuento;
	}
	public void setPctdescuento(Double pctdescuento) {
		this.pctdescuento = pctdescuento;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getProfundidad() {
		return profundidad;
	}
	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}
	public Boolean getSerializado() {
		return serializado;
	}
	public void setSerializado(Boolean serializado) {
		this.serializado = serializado;
	}
	public Boolean getSinexistencia() {
		return sinexistencia;
	}
	public void setSinexistencia(Boolean sinexistencia) {
		this.sinexistencia = sinexistencia;
	}
	public String getTipoarticulo() {
		return tipoarticulo;
	}
	public void setTipoarticulo(String tipoarticulo) {
		this.tipoarticulo = tipoarticulo;
	}
	public String getTipocosto() {
		return tipocosto;
	}
	public void setTipocosto(String tipocosto) {
		this.tipocosto = tipocosto;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public Double getUltimocosto() {
		return ultimocosto;
	}
	public void setUltimocosto(Double ultimocosto) {
		this.ultimocosto = ultimocosto;
	}
	public Double getCostoreal() {
		return costoreal;
	}
	public void setCostoreal(Double costoreal) {
		this.costoreal = costoreal;
	}
	public Double getDescuentoprov1() {
		return descuentoprov1;
	}
	public void setDescuentoprov1(Double descuentoprov1) {
		this.descuentoprov1 = descuentoprov1;
	}
	public Double getDescuentoprov2() {
		return descuentoprov2;
	}
	public void setDescuentoprov2(Double descuentoprov2) {
		this.descuentoprov2 = descuentoprov2;
	}
	public Double getDescuentoprov3() {
		return descuentoprov3;
	}
	public void setDescuentoprov3(Double descuentoprov3) {
		this.descuentoprov3 = descuentoprov3;
	}
	public Double getDescuentoprov4() {
		return descuentoprov4;
	}
	public void setDescuentoprov4(Double descuentoprov4) {
		this.descuentoprov4 = descuentoprov4;
	}
	public Double getCostobase() {
		return costobase;
	}
	public void setCostobase(Double costobase) {
		this.costobase = costobase;
	}
	public String getTipodescuento() {
		return tipodescuento;
	}
	public void setTipodescuento(String tipodescuento) {
		this.tipodescuento = tipodescuento;
	}
	public Boolean getUsacesta() {
		return usacesta;
	}
	public void setUsacesta(Boolean usacesta) {
		this.usacesta = usacesta;
	}
	public Boolean getPrecioporempaque() {
		return precioporempaque;
	}
	public void setPrecioporempaque(Boolean precioporempaque) {
		this.precioporempaque = precioporempaque;
	}
	public String getCodtipoiva() {
		return codtipoiva;
	}
	public void setCodtipoiva(String codtipoiva) {
		this.codtipoiva = codtipoiva;
	}
	public Long getCodtipislr() {
		return codtipislr;
	}
	public void setCodtipislr(Long codtipislr) {
		this.codtipislr = codtipislr;
	}
	public Long getCodmoneda() {
		return codmoneda;
	}
	public void setCodmoneda(Long codmoneda) {
		this.codmoneda = codmoneda;
	}
	public Long getCodpresentacion() {
		return codpresentacion;
	}
	public void setCodpresentacion(Long codpresentacion) {
		this.codpresentacion = codpresentacion;
	}
	public Long getCodtipo() {
		return codtipo;
	}
	public void setCodtipo(Long codtipo) {
		this.codtipo = codtipo;
	}
	public Long getCodsabor() {
		return codsabor;
	}
	public void setCodsabor(Long codsabor) {
		this.codsabor = codsabor;
	}
	public String getCodnegocio() {
		return codnegocio;
	}
	public void setCodnegocio(String codnegocio) {
		this.codnegocio = codnegocio;
	}
	public String getCodvendedor() {
		return codvendedor;
	}
	public void setCodvendedor(String codvendedor) {
		this.codvendedor = codvendedor;
	}
	public Long getCodlinea() {
		return codlinea;
	}
	public void setCodlinea(Long codlinea) {
		this.codlinea = codlinea;
	}
	public Boolean getAplicalista() {
		return aplicalista;
	}
	public void setAplicalista(Boolean aplicalista) {
		this.aplicalista = aplicalista;
	}
	public Double getMerma() {
		return merma;
	}
	public void setMerma(Double merma) {
		this.merma = merma;
	}
	public Double getCantreorden() {
		return cantreorden;
	}
	public void setCantreorden(Double cantreorden) {
		this.cantreorden = cantreorden;
	}
	public Boolean getDespostable() {
		return despostable;
	}
	public void setDespostable(Boolean despostable) {
		this.despostable = despostable;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getFechaultcompra() {
		return fechaultcompra;
	}
	public void setFechaultcompra(String fechaultcompra) {
		this.fechaultcompra = fechaultcompra;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNombrefamilia() {
		return nombrefamilia;
	}
	public void setNombrefamilia(String nombrefamilia) {
		this.nombrefamilia = nombrefamilia;
	}
	public String getNombregrupoarticulo() {
		return nombregrupoarticulo;
	}
	public void setNombregrupoarticulo(String nombregrupoarticulo) {
		this.nombregrupoarticulo = nombregrupoarticulo;
	}
	public String getNombreunidadmedida() {
		return nombreunidadmedida;
	}
	public void setNombreunidadmedida(String nombreunidadmedida) {
		this.nombreunidadmedida = nombreunidadmedida;
	}
	public String getNombremarca() {
		return nombremarca;
	}
	public void setNombremarca(String nombremarca) {
		this.nombremarca = nombremarca;
	}
	
	    

}
