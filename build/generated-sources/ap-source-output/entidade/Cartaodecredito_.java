package entidade;

import entidade.Cliente;
import entidade.Operadora;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-15T15:11:47")
@StaticMetamodel(Cartaodecredito.class)
public class Cartaodecredito_ { 

    public static volatile SingularAttribute<Cartaodecredito, Integer> cdcCodigoseguranca;
    public static volatile SingularAttribute<Cartaodecredito, Integer> cdcNumero;
    public static volatile SingularAttribute<Cartaodecredito, Operadora> opeCodigo;
    public static volatile SingularAttribute<Cartaodecredito, Cliente> cliCpf;
    public static volatile SingularAttribute<Cartaodecredito, String> cdcNomenocartao;
    public static volatile SingularAttribute<Cartaodecredito, Date> cdcDatavalidade;

}