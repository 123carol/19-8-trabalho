public class Endereco {

private Integer id;
private String rua;
private String bairro;
private Integer numero;

public Endereco() {
super();

}




public Endereco(Integer id, String rua, String bairro, Integer numero) {
super();
this.id = id;
this.rua = rua;
this.bairro = bairro;
this.numero = numero;
}




public Integer getId() {
return id;
}
public void setId(Integer id) {
this.id = id;
}
public String getRua() {
return rua;
}
public void setRua(String rua) {
this.rua = rua;
}
public String getBairro() {
return bairro;
}
public void setBairro(String bairro) {
this.bairro = bairro;
}
public Integer getNumero() {
return numero;
}
public void setNumero(Integer numero) {
this.numero = numero;
}

}
