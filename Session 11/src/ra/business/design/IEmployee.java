package ra.business.design;

import ra.business.entity.Employee;

public interface IEmployee extends IGenericDesign<Employee,Integer> {
    int getNewId();
}
