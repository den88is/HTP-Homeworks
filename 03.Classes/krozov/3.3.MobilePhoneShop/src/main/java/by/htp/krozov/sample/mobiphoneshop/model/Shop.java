package by.htp.krozov.sample.mobiphoneshop.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by krozov on 14.12.14.
 */
public class Shop {
    private final List<Phone> phones = new ArrayList<Phone>();

    public List<Phone> getPhones() {
        return new ArrayList<Phone>(phones);
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public List<Phone> search(PhoneSearchQuery query) {
        List<Phone> result = new ArrayList<Phone>();
        for (Phone phone : result) {
            if (phone.check(query)) {
                result.add(phone);
            }
        }
        return result;
    }
}
