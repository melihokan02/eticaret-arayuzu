package com.example.eticaret.presentation.product_list;

import com.example.eticaret.domain.repository.ProductRepository;
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
public final class ProductListViewModel_Factory implements Factory<ProductListViewModel> {
  private final Provider<ProductRepository> repositoryProvider;

  public ProductListViewModel_Factory(Provider<ProductRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ProductListViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ProductListViewModel_Factory create(
      Provider<ProductRepository> repositoryProvider) {
    return new ProductListViewModel_Factory(repositoryProvider);
  }

  public static ProductListViewModel newInstance(ProductRepository repository) {
    return new ProductListViewModel(repository);
  }
}
