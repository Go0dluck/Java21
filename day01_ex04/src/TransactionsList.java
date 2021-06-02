import java.util.UUID;

public interface TransactionsList {
    void addTransaction(Transaction transaction);
    void removeTransaction(UUID uuid) throws TransactionNotFoundException;
    Transaction[] toArray();
}
//89279920204 Tatiyana эквайринг
//89272432979 Рамиль корп блок
//89173914468 Аскар аналитика
//89272455420 Анна
//tvpavlova@sberbank.ru