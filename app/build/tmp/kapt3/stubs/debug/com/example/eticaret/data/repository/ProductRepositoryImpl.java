package com.example.eticaret.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\tJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0096@\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/eticaret/data/repository/ProductRepositoryImpl;", "Lcom/example/eticaret/domain/repository/ProductRepository;", "api", "Lcom/example/eticaret/data/remote/FakeStoreApi;", "(Lcom/example/eticaret/data/remote/FakeStoreApi;)V", "getProductById", "Lcom/example/eticaret/domain/model/Product;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "translateProduct", "product", "app_debug"})
public final class ProductRepositoryImpl implements com.example.eticaret.domain.repository.ProductRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.eticaret.data.remote.FakeStoreApi api = null;
    
    @javax.inject.Inject()
    public ProductRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.eticaret.data.remote.FakeStoreApi api) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getProducts(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.eticaret.domain.model.Product>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getProductById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.eticaret.domain.model.Product> $completion) {
        return null;
    }
    
    private final com.example.eticaret.domain.model.Product translateProduct(com.example.eticaret.domain.model.Product product) {
        return null;
    }
}