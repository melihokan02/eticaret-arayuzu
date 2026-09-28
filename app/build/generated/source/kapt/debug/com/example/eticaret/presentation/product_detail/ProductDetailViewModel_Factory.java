package com.example.eticaret.presentation.product_detail;

import androidx.lifecycle.SavedStateHandle;
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
public final class ProductDetailViewModel_Factory implements Factory<ProductDetailViewModel> {
  private final Provider<ProductRepository> repositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public ProductDetailViewModel_Factory(Provider<ProductRepository> repositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.repositoryProvider = repositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public ProductDetailViewModel get() {
    return newInstance(repositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static ProductDetailViewModel_Factory create(
      Provider<ProductRepository> repositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new ProductDetailViewModel_Factory(repositoryProvider, savedStateHandleProvider);
  }

  public static ProductDetailViewModel newInstance(ProductRepository repository,
      SavedStateHandle savedStateHandle) {
    return new ProductDetailViewModel(repository, savedStateHandle);
  }
}
