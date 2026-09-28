package com.example.eticaret.data.repository;

import com.example.eticaret.data.remote.FakeStoreApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class ProductRepositoryImpl_Factory implements Factory<ProductRepositoryImpl> {
  private final Provider<FakeStoreApi> apiProvider;

  public ProductRepositoryImpl_Factory(Provider<FakeStoreApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public ProductRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static ProductRepositoryImpl_Factory create(Provider<FakeStoreApi> apiProvider) {
    return new ProductRepositoryImpl_Factory(apiProvider);
  }

  public static ProductRepositoryImpl newInstance(FakeStoreApi api) {
    return new ProductRepositoryImpl(api);
  }
}
