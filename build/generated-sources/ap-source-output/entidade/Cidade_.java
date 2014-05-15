package entidade;

import entidade.Endereco;
import entidade.Estado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-05-15T15:11:47")
@StaticMetamodel(Cidade.class)
public class Cidade_ { 

    public static volatile SingularAttribute<Cidade, Integer> cidCodigo;
    public static volatile CollectionAttribute<Cidade, Endereco> enderecoCollection;
    public static volatile SingularAttribute<Cidade, Estado> estCodigo;
    public static volatile SingularAttribute<Cidade, String> cidDescricao;

}