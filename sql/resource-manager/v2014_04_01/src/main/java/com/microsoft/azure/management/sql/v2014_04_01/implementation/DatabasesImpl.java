/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.sql.v2014_04_01.Databases;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.sql.v2014_04_01.Database;
import com.microsoft.azure.management.sql.v2014_04_01.ImportExportResponse;
import com.microsoft.azure.management.sql.v2014_04_01.ExportRequest;
import com.microsoft.azure.management.sql.v2014_04_01.ImportRequest;

class DatabasesImpl extends WrapperImpl<DatabasesInner> implements Databases {
    private final SqlManager manager;

    DatabasesImpl(SqlManager manager) {
        super(manager.inner().databases());
        this.manager = manager;
    }

    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public DatabaseImpl define(String name) {
        return wrapModel(name);
    }

    private DatabaseImpl wrapModel(DatabaseInner inner) {
        return  new DatabaseImpl(inner, manager());
    }

    private DatabaseImpl wrapModel(String name) {
        return new DatabaseImpl(name, this.manager());
    }

    @Override
    public Completable pauseAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.pauseAsync(resourceGroupName, serverName, databaseName).toCompletable();
    }

    @Override
    public Completable resumeAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.resumeAsync(resourceGroupName, serverName, databaseName).toCompletable();
    }

    @Override
    public Observable<Database> getByElasticPoolAsync(String resourceGroupName, String serverName, String elasticPoolName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.getByElasticPoolAsync(resourceGroupName, serverName, elasticPoolName, databaseName)
        .map(new Func1<DatabaseInner, Database>() {
            @Override
            public Database call(DatabaseInner inner) {
                return new DatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Database> listByElasticPoolAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        DatabasesInner client = this.inner();
        return client.listByElasticPoolAsync(resourceGroupName, serverName, elasticPoolName)
        .flatMap(new Func1<List<DatabaseInner>, Observable<DatabaseInner>>() {
            @Override
            public Observable<DatabaseInner> call(List<DatabaseInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<DatabaseInner, Database>() {
            @Override
            public Database call(DatabaseInner inner) {
                return new DatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Database> getByRecommendedElasticPoolAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.getByRecommendedElasticPoolAsync(resourceGroupName, serverName, recommendedElasticPoolName, databaseName)
        .map(new Func1<DatabaseInner, Database>() {
            @Override
            public Database call(DatabaseInner inner) {
                return new DatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Database> listByRecommendedElasticPoolAsync(String resourceGroupName, String serverName, String recommendedElasticPoolName) {
        DatabasesInner client = this.inner();
        return client.listByRecommendedElasticPoolAsync(resourceGroupName, serverName, recommendedElasticPoolName)
        .flatMap(new Func1<List<DatabaseInner>, Observable<DatabaseInner>>() {
            @Override
            public Observable<DatabaseInner> call(List<DatabaseInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<DatabaseInner, Database>() {
            @Override
            public Database call(DatabaseInner inner) {
                return new DatabaseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ImportExportResponse> exportAsync(String resourceGroupName, String serverName, String databaseName, ExportRequest parameters) {
        DatabasesInner client = this.inner();
        return client.exportAsync(resourceGroupName, serverName, databaseName, parameters)
        .map(new Func1<ImportExportResponseInner, ImportExportResponse>() {
            @Override
            public ImportExportResponse call(ImportExportResponseInner inner) {
                return new ImportExportResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Database> listByServerAsync(String resourceGroupName, String serverName) {
        DatabasesInner client = this.inner();
        return client.listByServerAsync(resourceGroupName, serverName)
        .flatMap(new Func1<List<DatabaseInner>, Observable<DatabaseInner>>() {
            @Override
            public Observable<DatabaseInner> call(List<DatabaseInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<DatabaseInner, Database>() {
            @Override
            public Database call(DatabaseInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Database> getAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.getAsync(resourceGroupName, serverName, databaseName)
        .map(new Func1<DatabaseInner, Database>() {
            @Override
            public Database call(DatabaseInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serverName, String databaseName) {
        DatabasesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serverName, databaseName).toCompletable();
    }

    @Override
    public ImportExportResponseImpl defineExtension(String name) {
        return wrapExtensionModel(name);
    }

    private ImportExportResponseImpl wrapExtensionModel(String name) {
        return new ImportExportResponseImpl(name, this.manager());
    }

    private ImportExportResponseImpl wrapImportExportResponseModel(ImportExportResponseInner inner) {
        return  new ImportExportResponseImpl(inner, manager());
    }

    @Override
    public Observable<ImportExportResponse> importMethodAsync(String resourceGroupName, String serverName, ImportRequest parameters) {
        DatabasesInner client = this.inner();
        return client.importMethodAsync(resourceGroupName, serverName, parameters)
        .map(new Func1<ImportExportResponseInner, ImportExportResponse>() {
            @Override
            public ImportExportResponse call(ImportExportResponseInner inner) {
                return new ImportExportResponseImpl(inner, manager());
            }
        });
    }

}
