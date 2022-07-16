import './card.styles.css';

const Card = ({ book }) => {
  const { id, name } = book;

  return (
    <div className='card-container'>
      <img
        alt={`book ${name}`}
        src={'/public/book-clipart.png'}
      />
      <h2>{name}</h2>
    </div>
  );
};

export default Card;
