import Card from '../card/card.component';
import './card-list.styles.css';

const CardList = ({ books }) => (
  <div className='card-list'>
    {books.map((book) => {
      return <Card key={book.id} book={book} />;
    })}
  </div>
);

export default CardList;
