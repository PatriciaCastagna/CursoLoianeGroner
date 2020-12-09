package labs24.labs33;

public class NewClasslampada {
    private String modelo;
    private String tensão;
    private int potência;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String []tipos;
    private boolean tipoAbajour;
    private boolean ligada;
    
     public NewClasslampada() {
    }

    public NewClasslampada(String modelo, String tensão, int potência, String cor, String tipoLuz, int garantiaMeses, String[] tipos, boolean tipoAbajour, boolean ligada) {
        this.modelo = modelo;
        this.tensão = tensão;
        this.potência = potência;
        this.cor = cor;
        this.tipoLuz = tipoLuz;
        this.garantiaMeses = garantiaMeses;
        this.tipos = tipos;
        this.tipoAbajour = tipoAbajour;
        this.ligada = ligada;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the tensão
     */
    public String getTensão() {
        return tensão;
    }

    /**
     * @param tensão the tensão to set
     */
    public void setTensão(String tensão) {
        this.tensão = tensão;
    }

    /**
     * @return the potência
     */
    public int getPotência() {
        return potência;
    }

    /**
     * @param potência the potência to set
     */
    public void setPotência(int potência) {
        this.potência = potência;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the tipoLuz
     */
    public String getTipoLuz() {
        return tipoLuz;
    }

    /**
     * @param tipoLuz the tipoLuz to set
     */
    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    /**
     * @return the garantiaMeses
     */
    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    /**
     * @param garantiaMeses the garantiaMeses to set
     */
    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    /**
     * @return the tipos
     */
    public String[] getTipos() {
        return tipos;
    }

    /**
     * @param tipos the tipos to set
     */
    public void setTipos(String[] tipos) {
        this.tipos = tipos;
    }

    /**
     * @return the tipoAbajour
     */
    public boolean isTipoAbajour() {
        return tipoAbajour;
    }

    /**
     * @param tipoAbajour the tipoAbajour to set
     */
    public void setTipoAbajour(boolean tipoAbajour) {
        this.tipoAbajour = tipoAbajour;
    }

    /**
     * @return the ligada
     */
    public boolean isLigada() {
        return ligada;
    }

    /**
     * @param ligada the ligada to set
     */
    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

   
    
    
    
    
}
