package btvn.bt03.business.design;

import btvn.bt03.business.entity.Product;

public interface IProduct extends IGenericDesign<Product,Integer>{
    String getNewId();
}
