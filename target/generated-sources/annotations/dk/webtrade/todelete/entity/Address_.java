package dk.webtrade.todelete.entity;

import dk.webtrade.todelete.entity.Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-28T08:47:22")
@StaticMetamodel(Address.class)
public class Address_ { 

    public static volatile SingularAttribute<Address, String> zip;
    public static volatile SingularAttribute<Address, Integer> no;
    public static volatile SingularAttribute<Address, String> street;
    public static volatile SingularAttribute<Address, Integer> id;
    public static volatile ListAttribute<Address, Customer> customers;

}