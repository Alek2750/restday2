package dk.webtrade.todelete.entity;

import dk.webtrade.todelete.entity.Address;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-02-28T08:47:22")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> firstname;
    public static volatile SingularAttribute<Customer, Address> address;
    public static volatile SingularAttribute<Customer, Integer> id;
    public static volatile SingularAttribute<Customer, Integer> age;
    public static volatile SingularAttribute<Customer, String> lastname;

}