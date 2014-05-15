package entidade;

import entidade.Cidade;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-15T15:11:47")
@StaticMetamodel(Estado.class)
public class Estado_ { 

    public static volatile SingularAttribute<Estado, String> estDescricao;
    public static volatile CollectionAttribute<Estado, Cidade> cidadeCollection;
    public static volatile SingularAttribute<Estado, Integer> estCodigo;

}