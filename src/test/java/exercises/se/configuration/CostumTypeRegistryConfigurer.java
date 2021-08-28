package exercises.se.configuration;



import cucumber.api.TypeRegistry;
import cucumber.runtime.DefaultTypeRegistryConfiguration;

import exercises.se.data.DatatableClass;
import exercises.se.data.User;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

import java.util.Locale;
import java.util.Map;


public class CostumTypeRegistryConfigurer  extends DefaultTypeRegistryConfiguration {
    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }
    @Override
    public void configureTypeRegistry(TypeRegistry typeRegistry) {

        typeRegistry.defineDataTableType(defineOwnDataTable());
    }


    public DataTableType defineOwnDataTable() {
        return new DataTableType(User.class,
                (TableEntryTransformer<User>) dataRow -> {

                    User user = new User();
                    user.setUsername(dataRow.get("username"));
                    user.setPassword(dataRow.get("password"));

                    return user;
                });
    }
//        DataTableType tableType = new DataTableType(DatatableClass.class, transformer);
//        typeRegistry.defineDataTableType(tableType);
    }




