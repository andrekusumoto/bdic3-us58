package entidade;

import entidade.Cartaodecredito;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-15T15:11:47")
@StaticMetamodel(Operadora.class)
public class Operadora_ { 

    public static volatile SingularAttribute<Operadora, String> opeDescricao;
    public static volatile SingularAttribute<Operadora, Integer> opeCodigo;
    public static volatile CollectionAttribute<Operadora, Cartaodecredito> cartaodecreditoCollection;

}