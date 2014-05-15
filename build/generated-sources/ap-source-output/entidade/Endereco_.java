package entidade;

import entidade.Cidade;
import entidade.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-15T15:11:47")
@StaticMetamodel(Endereco.class)
public class Endereco_ { 

    public static volatile SingularAttribute<Endereco, String> endLatitude;
    public static volatile SingularAttribute<Endereco, Cidade> cidCodigo;
    public static volatile SingularAttribute<Endereco, String> endLogradouro;
    public static volatile SingularAttribute<Endereco, String> endBairro;
    public static volatile SingularAttribute<Endereco, String> endCep;
    public static volatile SingularAttribute<Endereco, Cliente> cliCpf;
    public static volatile SingularAttribute<Endereco, Integer> endNumero;
    public static volatile SingularAttribute<Endereco, String> endLongitude;
    public static volatile SingularAttribute<Endereco, Integer> endCodigo;
    public static volatile SingularAttribute<Endereco, String> endComplemento;

}