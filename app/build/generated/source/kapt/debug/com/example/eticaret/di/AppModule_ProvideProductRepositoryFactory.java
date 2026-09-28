package com.example.eticaret.di;

import com.example.eticaret.data.remote.FakeStoreApi;
import com.example.eticaret.domain.repository.ProductRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideProductRepositoryFactory implements Factory<ProductRepository> {
  private final Provider<FakeStoreApi> apiProvider;

  public AppModule_ProvideProductRepositoryFactory(Provider<FakeStoreApi> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public ProductRepository get() {
    return provideProductRepository(apiProvider.get());
  }

  public static AppModule_ProvideProductRepositoryFactory create(
      Provider<FakeStoreApi> apiProvider) {
    return new AppModule_ProvideProductRepositoryFactory(apiProvider);
  }

  public static ProductRepository provideProductRepository(FakeStoreApi api) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideProductRepository(api));
  }
}
