package br.com.samuelweb.nfe.util.model;

import br.com.samuelweb.nfe.util.annotation.NfeCampo;
import br.com.samuelweb.nfe.util.consts.DfeConsts;
import br.com.samuelweb.nfe.util.validators.impl.ValidarMunicipio;
import br.com.samuelweb.nfe.util.validators.impl.ValidarPais;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TEndereco;
import br.inf.portalfiscal.nfe.schema_4.enviNFe.TUf;

public class EnderDest {

    @NfeCampo(tipo = String.class
            , id = "E06", tag = "xLgr"
            , tamanhoMinimo = 2, tamanhoMaximo = 60, ocorrencias = 1
            , descricao = DfeConsts.DSC_XLGR)
    private String xLgr;

    @NfeCampo(tipo = String.class
            , id = "E07", tag = "nro", valorDefault = "SN"
            , tamanhoMinimo = 1, tamanhoMaximo = 60, ocorrencias = 1
            , descricao = DfeConsts.DSC_NRO)
    private String nro;

    @NfeCampo(tipo = String.class
            , id = "E08", tag = "xCpl"
            , tamanhoMinimo = 1, tamanhoMaximo = 60, ocorrencias = 0
            , descricao = DfeConsts.DSC_XCPL)
    private String xCpl;

    @NfeCampo(tipo = String.class
            , id = "E09", tag = "xBairro"
            , tamanhoMinimo = 1, tamanhoMaximo = 60, ocorrencias = 1
            , descricao = DfeConsts.DSC_XBAIRRO)
    private String xBairro;

    @NfeCampo(tipo = Integer.class
            , id = "E10", tag = "cMun", validadores = {ValidarMunicipio.class}
            , tamanhoMinimo = 2, tamanhoMaximo = 60, ocorrencias = 1
            , descricao = DfeConsts.DSC_CMUN)
    private Integer cMun;

    @NfeCampo(tipo = String.class
            , id = "E11", tag = "xMun"
            , tamanhoMinimo = 2, tamanhoMaximo = 60, ocorrencias = 1
            , descricao = DfeConsts.DSC_XMUN)
    private String xMun;

    @NfeCampo(tipo = String.class
            , id = "E12", tag = "UF"
            , tamanhoMinimo = 2, tamanhoMaximo = 2, ocorrencias = 1
            , descricao = DfeConsts.DSC_UF)
    private String uf;

    @NfeCampo(tipo = Integer.class
            , id = "E13", tag = "CEP"
            , tamanhoMinimo = 8, tamanhoMaximo = 8, ocorrencias = 0
            , descricao = DfeConsts.DSC_CEP)
    private Integer cep;

    @NfeCampo(tipo = Integer.class
            , id = "E14", tag = "cPais", validadores = {ValidarPais.class}
            , tamanhoMinimo = 1, tamanhoMaximo = 4, ocorrencias = 0
            , descricao = DfeConsts.DSC_CPAIS)
    private Integer cPais;

    @NfeCampo(tipo = String.class
            , id = "E15", tag = "xPais"
            , tamanhoMinimo = 2, tamanhoMaximo = 60, ocorrencias = 0
            , descricao = DfeConsts.DSC_XPAIS)
    private String xPais;

    @NfeCampo(tipo = String.class
            , id = "E16", tag = "fone"
            , tamanhoMinimo = 6, tamanhoMaximo = 14, ocorrencias = 0
            , descricao = DfeConsts.DSC_FONE)
    private String fone;

    public TEndereco build() {
        TEndereco endereco = new TEndereco();
        endereco.setXLgr(this.getxLgr());
        endereco.setNro(this.getNro());
        if (this.getxCpl() != null && !this.getxCpl().isEmpty()) {
            endereco.setXCpl(this.getxCpl());
        }
        endereco.setXBairro(this.getxBairro());
        if (this.getcMun() != null) {
            endereco.setCMun(this.getcMun().toString());
        }
        endereco.setXMun(this.getxMun());
        endereco.setUF(TUf.fromValue(this.getUf()));
        if (this.getCep() != null) {
            endereco.setCEP(this.getCep().toString());
        }
        if (this.getcPais() != null) {
            endereco.setCPais(this.getcPais().toString());
        }
        endereco.setXPais(this.getxPais());
        endereco.setFone(this.getFone());
        if (endereco.getXLgr() != null && !endereco.getXLgr().isEmpty()) {
            return endereco;
        }
        return null;
    }

    public String getxLgr() {
        return xLgr;
    }

    public String getNro() {
        return nro;
    }

    public String getxCpl() {
        return xCpl;
    }

    public String getxBairro() {
        return xBairro;
    }

    public Integer getcMun() {
        return cMun;
    }

    public String getxMun() {
        return xMun;
    }

    public String getUf() {
        return uf;
    }

    public Integer getCep() {
        return cep;
    }

    public Integer getcPais() {
        return cPais;
    }

    public String getxPais() {
        return xPais;
    }

    public String getFone() {
        return fone;
    }

    public EnderDest setxLgr(String xLgr) {
        this.xLgr = xLgr;
        return this;
    }

    public EnderDest setNro(String nro) {
        this.nro = nro;
        return this;
    }

    public EnderDest setxCpl(String xCpl) {
        this.xCpl = xCpl;
        return this;
    }

    public EnderDest setxBairro(String xBairro) {
        this.xBairro = xBairro;
        return this;
    }

    public EnderDest setcMun(Integer cMun) {
        this.cMun = cMun;
        return this;
    }

    public EnderDest setxMun(String xMun) {
        this.xMun = xMun;
        return this;
    }

    public EnderDest setUf(String uf) {
        this.uf = uf;
        return this;
    }

    public EnderDest setCep(Integer cep) {
        this.cep = cep;
        return this;
    }

    public EnderDest setcPais(Integer cPais) {
        this.cPais = cPais;
        return this;
    }

    public EnderDest setxPais(String xPais) {
        this.xPais = xPais;
        return this;
    }

    public EnderDest setFone(String fone) {
        this.fone = fone;
        return this;
    }

    public void validarRegraNegocio(InfNFe infNFe) {

    }
}