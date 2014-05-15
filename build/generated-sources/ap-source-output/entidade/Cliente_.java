package entidade;

import entidade.Cartaodecredito;
import entidade.Endereco;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-15T15:11:47")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> cliEmail;
    public static volatile SingularAttribute<Cliente, Date> cliDatanascimento;
    public static volatile SingularAttribute<Cliente, Integer> cliCpf;
    public static volatile CollectionAttribute<Cliente, Endereco> enderecoCollection;
    public static volatile SingularAttribute<Cliente, String> cliNome;
    public static volatile SingularAttribute<Cliente, String> cliSenha;
    public static volatile CollectionAttribute<Cliente, Cartaodecredito> cartaodecreditoCollection;

}