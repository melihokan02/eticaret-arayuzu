package com.example.eticaret.di;

import com.example.eticaret.data.remote.FakeStoreApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideFakeStoreApiFactory implements Factory<FakeStoreApi> {
  @Override
  public FakeStoreApi get() {
    return provideFakeStoreApi();
  }

  public static AppModule_ProvideFakeStoreApiFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FakeStoreApi provideFakeStoreApi() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideFakeStoreApi());
  }

  private static final class InstanceHolder {
    private static final AppModule_ProvideFakeStoreApiFactory INSTANCE = new AppModule_ProvideFakeStoreApiFactory();
  }
}
