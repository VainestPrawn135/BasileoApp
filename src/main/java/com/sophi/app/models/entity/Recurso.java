package com.sophi.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "RECURSOS")
public class Recurso implements Serializable  {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_recurso")
	private Long codRecurso;
	
	@Lob
    @Column(name = "desc_foto_personal", columnDefinition="BLOB")
	private byte[] foto;
	
	@Lob
    @Column(name = "desc_foto_cv", columnDefinition="BLOB")
    private byte[] fotoCv;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Column(name = "desc_recurso")
	private String descRecurso;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Column(name = "desc_apellido_paterno")
	private String descApellidoPaterno;
	
	@Column(name = "desc_apellido_materno")
	private String descApellidoMaterno;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Email(message = "No es un email correcto")
	@Column(name = "desc_correo_electronico")
	private String descCorreoElectronico;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Pattern(regexp="[\\d]{10}", message = "No es un número telefónico correcto")
	@Column(name = "desc_tel_celular")
	private String descTelCelular;
	
	@Column(name = "desc_tel_empresa")
	@Pattern(regexp="[\\d]{10}", message = "No es un número telefónico correcto")
	private String descTelEmpresa;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Column(name = "desc_rfc")
	private String descRfc;
	
	@Column(name = "desc_tel_ext")
//	@Pattern(regexp="\\0|\\d+", message = "No es una extensión correcta")
	private String descTelExt;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Column(name = "desc_curp")
	private String descCurp;
	
	@NotNull(message = "Este dato no debe estar vacío")
	@Column(name = "fec_nacimiento")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecNacimiento;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Column(name = "dir_calle")
	private String dirCalle;
	
	@Column(name = "dir_numero_ext")
	private String dirNumeroExt;
	
	@Column(name = "dir_numero_int")
	private String dirNumeroInt;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Column(name = "dir_colonia")
	private String dirColonia;
	
	@Pattern(regexp="\\d+", message = "No es un CP correcto")
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Column(name = "dir_cp")
	private String dirCp;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Column(name = "dir_alcaldia_municipio")
	private String dirAlcaldiaMunicipio;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Column(name = "dir_estado")
	private String dirEstado;
	
	@NotEmpty(message = "Este dato no debe estar vacío")
	@Column(name = "desc_nss")
	private String descNss;

	@Column(name = "desc_estado_civil")
	private String descEstadoCivil;
	
	@Column(name = "val_numero_hijos")
	private Long valNumeroHijos;
	
	@NotNull(message = "Este dato no debe estar vacío")
	@Column(name = "fec_ingreso_empresa")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fecIngresoEmpresa;
	
	@Column(name = "desc_activo")
	private Long descActivo;
	
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "fec_salida_empresa")
	private Date fecSalidaEmpresa;
	
	@Column(name = "desc_motivo_salida")
	private String descMotivoSalida;
	
	@Column(name = "cod_puesto")
	private Long codPuesto;
	
	@Column(name = "cod_jornada")
	private Long codJornada;
	
	@Column(name = "cod_tipo_recurso")
	private Long codTipoRecurso;
	
	@Column(name = "cod_proveedor")
	private Long codProveedor;
	
	@Column(name = "val_costo_minimo")
	private Float valCostoMinimo;
	
	@Column(name = "desc_edu_grado_escolaridad")
	private String descEduGradoEscolaridad;
	
	@Column(name = "desc_edu_etapa")
	private String descEduEtapa;
	
	@Column(name = "desc_edu_institucion_academica")
	private String descEduInstitucionAcademica;
	
	@Column(name = "desc_edu_documento_obtenido")
	private String descEduDocumentoObtenido;
	
	@Column(name = "desc_banco_nombre")
	private String descBancoNombre;
	
	@Column(name = "desc_banco_numero_cuenta")
	private String descBancoNumeroCuenta;
	
	@Column(name = "desc_banco_clabe")
	private String descBancoClabe;
	
	@Column(name = "desc_medicos_tipo_sangre")
	private String descMedicosTipoSangre;
	
	@Column(name = "desc_medicos_alergias")
	private String descMedicosAlergias;
	
	@Column(name = "desc_medicos_embarazos")
	private String descMedicosEmbarazos;
	
	@Column(name = "desc_medicos_cirugias")
	private String descMedicosCirugias;
	
	@Column(name = "desc_medicos_enfermedades")
	private String descMedicosEnfermedades;
	
	@Column(name = "fec_registro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecRegistro;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_recurso")
	private List<Herramienta> herramientas;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_recurso")
	private List<Dependiente> dependientes;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_recurso")
	private List<ContactoEmergencia> contactosEmergencia;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_recurso")
	private List<Sueldo> sueldos;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "cod_recurso")
	private List<Skill> skills;
	
	public Recurso() {
		herramientas = new ArrayList<Herramienta>();
		dependientes = new ArrayList<Dependiente>();
		contactosEmergencia = new ArrayList<ContactoEmergencia>();
		sueldos = new ArrayList<Sueldo>();
		skills = new ArrayList<Skill>();
	}

	@PrePersist
	public void prePersist() {
		fecRegistro = new Date();
	}

	public Long getCodRecurso() {
		return codRecurso;
	}

	public void setCodRecurso(Long codRecurso) {
		this.codRecurso = codRecurso;
	}

	public String getDescRecurso() {
		return descRecurso;
	}

	public void setDescRecurso(String descRecurso) {
		this.descRecurso = descRecurso;
	}

	public String getDescApellidoPaterno() {
		return descApellidoPaterno;
	}

	public void setDescApellidoPaterno(String descApellidoPaterno) {
		this.descApellidoPaterno = descApellidoPaterno;
	}

	public String getDescApellidoMaterno() {
		return descApellidoMaterno;
	}

	public void setDescApellidoMaterno(String descApellidoMaterno) {
		this.descApellidoMaterno = descApellidoMaterno;
	}

	public String getDescCorreoElectronico() {
		return descCorreoElectronico;
	}

	public void setDescCorreoElectronico(String descCorreoElectronico) {
		this.descCorreoElectronico = descCorreoElectronico;
	}

	public String getDescTelCelular() {
		return descTelCelular;
	}

	public void setDescTelCelular(String descTelCelular) {
		this.descTelCelular = descTelCelular;
	}

	public String getDescTelEmpresa() {
		return descTelEmpresa;
	}

	public void setDescTelEmpresa(String descTelEmpresa) {
		this.descTelEmpresa = descTelEmpresa;
	}

	public String getDescRfc() {
		return descRfc;
	}

	public void setDescRfc(String descRfc) {
		this.descRfc = descRfc;
	}

	public String getDescTelExt() {
		return descTelExt;
	}

	public void setDescTelExt(String descTelExt) {
		this.descTelExt = descTelExt;
	}

	public String getDescCurp() {
		return descCurp;
	}

	public void setDescCurp(String descCurp) {
		this.descCurp = descCurp;
	}

	public Date getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String getDirCalle() {
		return dirCalle;
	}

	public void setDirCalle(String dirCalle) {
		this.dirCalle = dirCalle;
	}

	public String getDirNumeroExt() {
		return dirNumeroExt;
	}

	public void setDirNumeroExt(String dirNumeroExt) {
		this.dirNumeroExt = dirNumeroExt;
	}

	public String getDirNumeroInt() {
		return dirNumeroInt;
	}

	public void setDirNumeroInt(String dirNumeroInt) {
		this.dirNumeroInt = dirNumeroInt;
	}

	public String getDirColonia() {
		return dirColonia;
	}

	public void setDirColonia(String dirColonia) {
		this.dirColonia = dirColonia;
	}

	public String getDirCp() {
		return dirCp;
	}

	public void setDirCp(String dirCp) {
		this.dirCp = dirCp;
	}

	public String getDirAlcaldiaMunicipio() {
		return dirAlcaldiaMunicipio;
	}

	public void setDirAlcaldiaMunicipio(String dirAlcaldiaMunicipio) {
		this.dirAlcaldiaMunicipio = dirAlcaldiaMunicipio;
	}

	public String getDirEstado() {
		return dirEstado;
	}

	public void setDirEstado(String dirEstado) {
		this.dirEstado = dirEstado;
	}

	public String getDescNss() {
		return descNss;
	}

	public void setDescNss(String descNss) {
		this.descNss = descNss;
	}

	public String getDescEstadoCivil() {
		return descEstadoCivil;
	}

	public void setDescEstadoCivil(String descEstadoCivil) {
		this.descEstadoCivil = descEstadoCivil;
	}

	public Long getValNumeroHijos() {
		return valNumeroHijos;
	}

	public void setValNumeroHijos(Long valNumeroHijos) {
		this.valNumeroHijos = valNumeroHijos;
	}

	public Date getFecIngresoEmpresa() {
		return fecIngresoEmpresa;
	}

	public void setFecIngresoEmpresa(Date fecIngresoEmpresa) {
		this.fecIngresoEmpresa = fecIngresoEmpresa;
	}

	public Long getDescActivo() {
		return descActivo;
	}

	public void setDescActivo(Long descActivo) {
		this.descActivo = descActivo;
	}

	public Date getFecSalidaEmpresa() {
		return fecSalidaEmpresa;
	}

	public void setFecSalidaEmpresa(Date fecSalidaEmpresa) {
		this.fecSalidaEmpresa = fecSalidaEmpresa;
	}

	public String getDescMotivoSalida() {
		return descMotivoSalida;
	}

	public void setDescMotivoSalida(String descMotivoSalida) {
		this.descMotivoSalida = descMotivoSalida;
	}

	public Long getCodPuesto() {
		return codPuesto;
	}

	public void setCodPuesto(Long codPuesto) {
		this.codPuesto = codPuesto;
	}

	public Long getCodJornada() {
		return codJornada;
	}

	public void setCodJornada(Long codJornada) {
		this.codJornada = codJornada;
	}

	public Long getCodTipoRecurso() {
		return codTipoRecurso;
	}

	public void setCodTipoRecurso(Long codTipoRecurso) {
		this.codTipoRecurso = codTipoRecurso;
	}

	public Long getCodProveedor() {
		return codProveedor;
	}

	public void setCodProveedor(Long codProveedor) {
		this.codProveedor = codProveedor;
	}

	public Float getValCostoMinimo() {
		return valCostoMinimo;
	}

	public void setValCostoMinimo(Float valCostoMinimo) {
		this.valCostoMinimo = valCostoMinimo;
	}

	public String getDescEduGradoEscolaridad() {
		return descEduGradoEscolaridad;
	}

	public void setDescEduGradoEscolaridad(String descEduGradoEscolaridad) {
		this.descEduGradoEscolaridad = descEduGradoEscolaridad;
	}

	public String getDescEduEtapa() {
		return descEduEtapa;
	}

	public void setDescEduEtapa(String descEduEtapa) {
		this.descEduEtapa = descEduEtapa;
	}

	public String getDescEduInstitucionAcademica() {
		return descEduInstitucionAcademica;
	}

	public void setDescEduInstitucionAcademica(String descEduInstitucionAcademica) {
		this.descEduInstitucionAcademica = descEduInstitucionAcademica;
	}

	public String getDescEduDocumentoObtenido() {
		return descEduDocumentoObtenido;
	}

	public void setDescEduDocumentoObtenido(String descEduDocumentoObtenido) {
		this.descEduDocumentoObtenido = descEduDocumentoObtenido;
	}

	public String getDescBancoNombre() {
		return descBancoNombre;
	}

	public void setDescBancoNombre(String descBancoNombre) {
		this.descBancoNombre = descBancoNombre;
	}

	public String getDescBancoNumeroCuenta() {
		return descBancoNumeroCuenta;
	}

	public void setDescBancoNumeroCuenta(String descBancoNumeroCuenta) {
		this.descBancoNumeroCuenta = descBancoNumeroCuenta;
	}

	public String getDescBancoClabe() {
		return descBancoClabe;
	}

	public void setDescBancoClabe(String descBancoClabe) {
		this.descBancoClabe = descBancoClabe;
	}

	public String getDescMedicosTipoSangre() {
		return descMedicosTipoSangre;
	}

	public void setDescMedicosTipoSangre(String descMedicosTipoSangre) {
		this.descMedicosTipoSangre = descMedicosTipoSangre;
	}

	public String getDescMedicosAlergias() {
		return descMedicosAlergias;
	}

	public void setDescMedicosAlergias(String descMedicosAlergias) {
		this.descMedicosAlergias = descMedicosAlergias;
	}

	public String getDescMedicosEmbarazos() {
		return descMedicosEmbarazos;
	}

	public void setDescMedicosEmbarazos(String descMedicosEmbarazos) {
		this.descMedicosEmbarazos = descMedicosEmbarazos;
	}

	public String getDescMedicosCirugias() {
		return descMedicosCirugias;
	}

	public void setDescMedicosCirugias(String descMedicosCirugias) {
		this.descMedicosCirugias = descMedicosCirugias;
	}

	public String getDescMedicosEnfermedades() {
		return descMedicosEnfermedades;
	}

	public void setDescMedicosEnfermedades(String descMedicosEnfermedades) {
		this.descMedicosEnfermedades = descMedicosEnfermedades;
	}

	public Date getFecRegistro() {
		return fecRegistro;
	}

	public void setFecRegistro(Date fecRegistro) {
		this.fecRegistro = fecRegistro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Herramienta> getHerramientas() {
		return herramientas;
	}

	public void setHerramientas(List<Herramienta> herramientas) {
		this.herramientas = herramientas;
	}
	
	public void addHerramienta(Herramienta herramienta) {
		herramientas.add(herramienta);
	}

	public List<Dependiente> getDependientes() {
		return dependientes;
	}

	public void setDependientes(List<Dependiente> dependientes) {
		this.dependientes = dependientes;
	}

	public List<ContactoEmergencia> getContactosEmergencia() {
		return contactosEmergencia;
	}

	public void setContactosEmergencia(List<ContactoEmergencia> contactosEmergencia) {
		this.contactosEmergencia = contactosEmergencia;
	}
	
	

	public List<Skill> getSkills() {
		return skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public List<Sueldo> getSueldos() {
		return sueldos;
	}

	public void setSueldos(List<Sueldo> sueldos) {
		this.sueldos = sueldos;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public byte[] getFotoCv() {
		return fotoCv;
	}

	public void setFotoCv(byte[] fotoCv) {
		this.fotoCv = fotoCv;
	}
	
	

}