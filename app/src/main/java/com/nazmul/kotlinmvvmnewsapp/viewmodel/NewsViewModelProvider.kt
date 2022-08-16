import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nazmul.kotlinmvvmnewsapp.repository.NewsRepository
import com.nazmul.kotlinmvvmnewsapp.viewmodel.NewsViewModel

class NewsViewModelProvider(
    var newsRepository: NewsRepository
) : ViewModelProvider.Factory{

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NewsViewModel(newsRepository) as T
    }
}

